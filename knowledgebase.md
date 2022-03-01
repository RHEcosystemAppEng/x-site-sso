- Some command for guidance
```
/subsystem=infinispan/cache-container=keycloak:read-resource(recursive=true)
/subsystem=infinispan/cache-container=keycloak/distributed-cache=clientSessions:read-resource(recursive=true)
help /subsystem=infinispan/cache-container=keycloak/distributed-cache=?:add
help /subsystem=infinispan/cache-container=keycloak/distributed-cache=?:read-attribute
```


```
And as in replicated mode, asynchronous replication is not recommended because it can lose updates.
```

- Performance Optimization
```
l1-lifespan

```