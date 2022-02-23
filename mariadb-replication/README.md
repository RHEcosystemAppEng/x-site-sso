- All all 3 DB instances
```
sudo subscription-manager register --username mpaul@redhat.com --password Andromeda@22 --auto-attach
sudo subscription-manager config --rhsm.manage_repos=1
sudo yum module install mariadb:10.3/galera
sudo systemctl start mariadb
sudo systemctl enable mariadb
sudo systemctl status mariadb
sudo mysql -uroot
set password = password("password");
quit;
sudo yum install rsync -y
sudo yum install python3-policycoreutils -y
```

- DB Instance List
```
10.1.0.98 - db-0 - uswest2
10.1.0.36 - db-1 - uswest2
10.2.0.121 - db-3 - useast2
```


- Configuring the first node
```
sudo vi /etc/my.cnf.d/galera.cnf
```

```
- Db1 Instance Configuration
```
[mysqld]
binlog_format=ROW
default-storage-engine=innodb
innodb_autoinc_lock_mode=2
bind-address=0.0.0.0

# Galera Provider Configuration
wsrep_on=1 
wsrep_provider=/usr/lib64/galera-4/libgalera_smm.so

# Galera Cluster Configuration
wsrep_cluster_name="my_wsrep_cluster"
wsrep_cluster_address="gcomm://10.1.0.98,10.1.0.36,10.2.0.121"

# Galera Synchronization Configuration
wsrep_sst_method=rsync

# Galera Node Configuration
wsrep_node_address="10.1.0.98"
wsrep_node_name="db-0"
```
- Configure the other 2 instances
```
sudo vi /etc/my.cnf.d/galera.cnf
```

- DB2 and DB3 instance
```
[mysqld]
binlog_format=ROW
default-storage-engine=innodb
innodb_autoinc_lock_mode=2
bind-address=0.0.0.0

# Galera Provider Configuration
wsrep_on=1 
wsrep_provider=/usr/lib64/galera-4/libgalera_smm.so

# Galera Cluster Configuration
wsrep_cluster_name="my_wsrep_cluster"
wsrep_cluster_address="gcomm://10.1.0.98,10.1.0.36,10.2.0.121"

# Galera Synchronization Configuration
wsrep_sst_method=rsync

# Galera Node Configuration
wsrep_node_address="10.1.0.36"
wsrep_node_name="db-1"

```

```
[mysqld]
binlog_format=ROW
default-storage-engine=innodb
innodb_autoinc_lock_mode=2
bind-address=0.0.0.0

# Galera Provider Configuration
wsrep_on=1 
wsrep_provider=/usr/lib64/galera-4/libgalera_smm.so

# Galera Cluster Configuration
wsrep_cluster_name="my_wsrep_cluster"
wsrep_cluster_address="gcomm://10.1.0.98,10.1.0.36,10.2.0.121"

# Galera Synchronization Configuration
wsrep_sst_method=rsync

# Galera Node Configuration
wsrep_node_address="10.2.0.121"
wsrep_node_name="db-2"
```

- Create SE Linux Policy on all 3 db instances
```
sudo semanage port -a -t mysqld_port_t -p tcp 4567
sudo semanage port -a -t mysqld_port_t -p udp 4567
sudo semanage port -a -t mysqld_port_t -p tcp 4568
sudo semanage port -a -t mysqld_port_t -p tcp 4444
```

- run the following command on all three servers, which sets the MySQL SELinux domain to permissive mode temporarily
```
sudo semanage permissive -a mysqld_t
```

-  stop the database server on all the nodes so that you will be able to bootstrap the database cluster with shared SELinux policies
```
sudo systemctl stop mariadb
```

- bootstrap the cluster to generate inter-node communication events that will be added to the SELinux policy. On the first node, bootstrap the cluster by executing

```
sudo galera_new_cluster
```
- Create a database and table for the specific purpose of logging SST events by running the following on the first node
```
mysql -u root -p -e 'CREATE DATABASE selinux; CREATE TABLE selinux.selinux_policy (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id)); INSERT INTO selinux selinux_policy VALUES ();'
```

- Start the server in second node
```
sudo systemctl start mariadb
```
- Do the same in third node

- Check the status of the service in all three nodes
```
sudo systemctl status mariadb.service
```
- To generate IST events execute the following in all three servers
```
mysql -u root -p -e 'INSERT INTO selinux.selinux_policy VALUES ();'
```

- Starting the cluster
- Stop node3
```
sudo systemctl stop mariadb
```
- Stop node2
```
sudo systemctl stop mariadb
```

- Stop node1
```
sudo systemctl stop mariadb
```


- Bring up the first node
```
sudo galera_new_cluster
```

- Check the size of the cluster
```
mysql -u root -p -e "SHOW STATUS LIKE 'wsrep_cluster_size'"
```

- Bring up the second node
```
sudo systemctl start mariadb
```

- Check the size of the cluster
```
mysql -u root -p -e "SHOW STATUS LIKE 'wsrep_cluster_size'"
```

- Bring up the third node
```
sudo systemctl start mariadb
```

- Check the size of the cluster
```
mysql -u root -p -e "SHOW STATUS LIKE 'wsrep_cluster_size'"
```

- Once finished the size of the cluster will be 3
