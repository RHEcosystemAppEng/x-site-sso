- Configuring mariadb with SSO
```
module add --name=org.mariadb --resources=/home/ec2-user/mariadb-java-client-2.7.3.jar --dependencies=javax.api,javax.resource.api

/subsystem=datasources/jdbc-driver=mariadb:add( driver-name=mariadb, driver-module-name=org.mariadb, driver-class-name=org.mariadb.jdbc.Driver, driver-xa-datasource-class-name=org.mariadb.jdbc.MariaDbDataSource )

/subsystem=datasources/data-source=KeycloakDS:remove()

/subsystem=datasources/data-source=KeycloakDS:add(jndi-name=java:jboss/datasources/KeycloakDS, enabled=true, use-java-context=true, connection-url=jdbc:mariadb://10.2.0.210:3306/rhsso74, driver-name=mariadb, user-name=rhsso74, password=redhat)
```