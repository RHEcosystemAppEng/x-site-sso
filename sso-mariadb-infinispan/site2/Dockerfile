FROM registry.redhat.io/rh-sso-7/sso75-openshift-rhel8:7.5-19
COPY sso-extensions.cli /opt/eap/extensions/
COPY truststore.jks /etc/truststore/
COPY mariadb-java-client-2.7.3.jar /opt/eap/extensions/jdbc-driver.jar