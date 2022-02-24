- ***Configuring mariadb with SSO***
    - DB Operatiions
    ```
    mysql -h localhost -uroot -predhat < mariadb_rhsso75_db_setup.sql
    mysql -h localhost -uroot -predhat
    show databases; // You should see the dbs - information_schema, mysql, performance_schema, rhsso74
    quit;
    mysql -h localhost -urhsso74 -predhat
    show databases;
    ```

    - Build the sso image for maria db
    ```
    docker build . -t quay.io/mpaulgreen/sso75maria:4
    docker push quay.io/mpaulgreen/sso75maria:4
    ```

    - On worker node 

    ```
    oc debug node/ip-10-0-200-198.us-west-2.compute.internal
    chroot /host
    podman pull quay.io/mpaulgreen/sso75maria:4
    podman tag quay.io/mpaulgreen/sso75maria:4 image-registry.openshift-image-registry.svc:5000/openshift/sso75maria:1
    podman push image-registry.openshift-image-registry.svc:5000/openshift/sso75maria:1
    ```

    - On OpenShift console
    ```
    oc new-app --template=sso75-ocp4-x509-https-maria
    ```

    - Update the template ```sso75-ocp4-x509-https-maria.json``` to include the new image



