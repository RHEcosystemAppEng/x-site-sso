```
oc new-app --template=sso74-ocp4-x509-https
oc extract secret/example-infinispan-cert-secret -n ${namespace} --keys=tls.crt --to=/tmp
keytool -importcert -file tls.crt -keystore truststore.jks
oc create secret generic truststore-secret --from-file=truststore.jks
oc set volume dc/sso --add --name=truststore-secret -m /etc/truststore -t secret --secret-name=truststore-secret --default-mode='0755'
oc get dc
oc set volume dc/sso --all
oc create configmap jboss-cli --from-file=sso-extensions.cli
oc set volume dc/sso --add --name=jboss-cli -m /opt/eap/extensions -t configmap --configmap-name=jboss-cli --default-mode='0755' --overwrite # Issue in this line- Cannot find trusted certficate
oc set env dc/sso \
-e "JAVA_OPTS_APPEND= \
-Djboss.site.name=site1"
oc set env dc/sso -e "JAVA_OPTS_APPEND= -Djboss.site.name=site1"
oc rsh <<sso-pod>>
./add-user-keycloak.sh -r master -u admin -p password
./jboss-cli.sh --connect ':reload'

cd /opt/eap/bin/
./kcadm.sh config credentials --server http://<<pod-ip>:8080/auth --realm master --user admin --password password

```

- TODO
    - Site2 needs to be provisioned
    - Configuration of cache is not ok - sso-extensions.cli needs to be modfied. 
        - Add also for actionTokens, loginFailures, offlineClientSessions, offlineSessions, sessions, once the config is fixed. These will be same as for clientSession.
    - Investigate Cache and POD logs