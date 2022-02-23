FROM registry.redhat.io/rh-sso-7/sso75-openshift-rhel8:7.5-19
COPY mariadb-java-client-2.7.3.jar /opt/eap/extensions/jdbc-driver.jar
