- OCP Cluster1
```
oc new-project rhdg-cluster
oc create sa c1
oc adm policy add-cluster-role-to-user cluster-admin system:serviceaccount:rhdg-cluster:c1
oc sa get-token c1 > c1.txt
```

- OCP Cluster2
```
oc new-project rhdg-cluster
oc create sa c2
oc adm policy add-cluster-role-to-user cluster-admin system:serviceaccount:rhdg-cluster:c2
oc sa get-token c2 > c2.txt
```

- Both OCP clusters
```
oc create secret generic c1-token --from-literal=token=$(cat c1.txt)
oc create secret generic c2-token --from-literal=token=$(cat c2.txt)
```

- OCP Cluster1
```
oc apply -f cluster1.yaml
```

- OCP Cluster2
```
oc apply -f cluster2.yaml
```

- Validation of x-site setup is successful on both OCP clusters
```
oc logs -f example-infinispan-0 | grep x-site
```

- Creating cache by web console
```
oc get secret example-infinispan-generated-secret -o jsonpath="{.data.identities\.yaml}" | base64 --decode
```

- select the route