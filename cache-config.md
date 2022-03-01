{
    "outcome" => "success",
    "result" => {
        "aliases" => undefined,
        "default-cache" => undefined,
        "eviction-executor" => undefined,
        "jndi-name" => undefined,
        "listener-executor" => undefined,
        "module" => "org.keycloak.keycloak-model-infinispan",
        "replication-queue-executor" => undefined,
        "start" => "LAZY",
        "statistics-enabled" => false,
        "cache" => undefined,
        "distributed-cache" => {
            "sessions" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "sessions",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            },
            "authenticationSessions" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_AUTH_SESSIONS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"none" => {}}
            },
            "offlineSessions" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "offlineSessions",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            },
            "clientSessions" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "clientSessions",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            },
            "offlineClientSessions" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "offlineClientSessions",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            },
            "loginFailures" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:1}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "loginFailures",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            },
            "actionTokens" => {
                "async-marshalling" => false,
                "batching" => false,
                "capacity-factor" => 1.0,
                "consistent-hash-strategy" => "INTER_CACHE",
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "l1-lifespan" => 0L,
                "mode" => "SYNC",
                "module" => undefined,
                "owners" => expression "${env.CACHE_OWNERS_COUNT:2}",
                "queue-flush-interval" => 10L,
                "queue-size" => 0,
                "remote-timeout" => 10000L,
                "segments" => 256,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "expiration" => {
                        "interval" => 300000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "backup-for" => {
                        "remote-cache" => "___defaultcache",
                        "remote-site" => undefined
                    },
                    "backups" => {"backup" => undefined},
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "partition-handling" => {"enabled" => false},
                    "state-transfer" => {
                        "chunk-size" => 512,
                        "enabled" => true,
                        "timeout" => 240000L
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => -1L,
                    "size" => -1L,
                    "strategy" => "NONE"
                }},
                "store" => {"remote" => {
                    "cache" => "actionTokens",
                    "fetch-state" => false,
                    "max-batch-size" => 100,
                    "passivation" => false,
                    "preload" => false,
                    "properties" => {
                        "rawValues" => "true",
                        "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                        "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                        "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                        "infinispan.client.hotrod.trust_store_password" => "redhat",
                        "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                        "infinispan.client.hotrod.auth_username" => "developer",
                        "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                        "infinispan.client.hotrod.use_ssl" => "true",
                        "remoteStoreSecurityEnabled" => "true",
                        "statistics" => "true",
                        "infinispan.client.hotrod.auth_realm" => "default",
                        "infinispan.client.hotrod.auth_server_name" => "infinispan"
                    },
                    "purge" => false,
                    "remote-servers" => ["remote-cache"],
                    "shared" => true,
                    "singleton" => false,
                    "socket-timeout" => 60000L,
                    "tcp-no-delay" => true,
                    "property" => undefined,
                    "write" => {"through" => {}}
                }}
            }
        },
        "invalidation-cache" => undefined,
        "local-cache" => {
            "realms" => {
                "batching" => false,
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "module" => undefined,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => 10000L,
                    "size" => 10000L,
                    "strategy" => "NONE"
                }},
                "store" => {"none" => {}}
            },
            "users" => {
                "batching" => false,
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "module" => undefined,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => 10000L,
                    "size" => 10000L,
                    "strategy" => "NONE"
                }},
                "store" => {"none" => {}}
            },
            "authorization" => {
                "batching" => false,
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "module" => undefined,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => -1L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => 10000L,
                    "size" => 10000L,
                    "strategy" => "NONE"
                }},
                "store" => {"none" => {}}
            },
            "keys" => {
                "batching" => false,
                "indexing" => "NONE",
                "indexing-properties" => undefined,
                "jndi-name" => undefined,
                "module" => undefined,
                "start" => "LAZY",
                "statistics-enabled" => false,
                "component" => {
                    "expiration" => {
                        "interval" => 60000L,
                        "lifespan" => -1L,
                        "max-idle" => 3600000L
                    },
                    "locking" => {
                        "acquire-timeout" => 15000L,
                        "concurrency-level" => 1000,
                        "isolation" => "READ_COMMITTED",
                        "striping" => false
                    },
                    "transaction" => {
                        "locking" => "PESSIMISTIC",
                        "mode" => "NONE",
                        "stop-timeout" => 10000L
                    }
                },
                "memory" => {"object" => {
                    "max-entries" => 1000L,
                    "size" => 1000L,
                    "strategy" => "NONE"
                }},
                "store" => {"none" => {}}
            }
        },
        "replicated-cache" => {"work" => {
            "async-marshalling" => false,
            "batching" => false,
            "indexing" => "NONE",
            "indexing-properties" => undefined,
            "jndi-name" => undefined,
            "mode" => "SYNC",
            "module" => undefined,
            "queue-flush-interval" => 10L,
            "queue-size" => 0,
            "remote-timeout" => 10000L,
            "start" => "LAZY",
            "statistics-enabled" => false,
            "component" => {
                "backup-for" => {
                    "remote-cache" => "___defaultcache",
                    "remote-site" => undefined
                },
                "backups" => {"backup" => undefined},
                "expiration" => {
                    "interval" => 60000L,
                    "lifespan" => -1L,
                    "max-idle" => -1L
                },
                "locking" => {
                    "acquire-timeout" => 15000L,
                    "concurrency-level" => 1000,
                    "isolation" => "READ_COMMITTED",
                    "striping" => false
                },
                "partition-handling" => {"enabled" => false},
                "state-transfer" => {
                    "chunk-size" => 512,
                    "enabled" => true,
                    "timeout" => 240000L
                },
                "transaction" => {
                    "locking" => "PESSIMISTIC",
                    "mode" => "NONE",
                    "stop-timeout" => 10000L
                }
            },
            "memory" => {"object" => {
                "max-entries" => -1L,
                "size" => -1L,
                "strategy" => "NONE"
            }},
            "store" => {"remote" => {
                "cache" => "work",
                "fetch-state" => false,
                "max-batch-size" => 100,
                "passivation" => false,
                "preload" => false,
                "properties" => {
                    "rawValues" => "true",
                    "remoteStoreSecurityEnabled" => "true",
                    "statistics" => "true",
                    "marshaller" => "org.keycloak.cluster.infinispan.KeycloakHotRodMarshallerFactory",
                    "infinispan.client.hotrod.sasl_properties.javax.security.sasl.qop" => "auth",
                    "infinispan.client.hotrod.trust_store_file_name" => "/etc/truststore/truststore.jks",
                    "infinispan.client.hotrod.trust_store_password" => "redhat",
                    "infinispan.client.hotrod.sasl_mechanism" => "DIGEST-MD5",
                    "infinispan.client.hotrod.auth_username" => "developer",
                    "infinispan.client.hotrod.auth_password" => "ZOxogEoKgdrSqWUz",
                    "infinispan.client.hotrod.use_ssl" => "true",
                    "infinispan.client.hotrod.auth_realm" => "default",
                    "infinispan.client.hotrod.auth_server_name" => "infinispan"
                },
                "purge" => false,
                "remote-servers" => ["remote-cache"],
                "shared" => true,
                "singleton" => false,
                "socket-timeout" => 60000L,
                "tcp-no-delay" => true,
                "property" => undefined,
                "write" => {"through" => {}}
            }}
        }},
        "scattered-cache" => undefined,
        "thread-pool" => {
            "async-operations" => {
                "keepalive-time" => 60000L,
                "max-threads" => 25,
                "min-threads" => 25,
                "queue-length" => 1000
            },
            "expiration" => {
                "keepalive-time" => 60000L,
                "max-threads" => 1
            },
            "listener" => {
                "keepalive-time" => 60000L,
                "max-threads" => 1,
                "min-threads" => 1,
                "queue-length" => 100000
            },
            "persistence" => {
                "keepalive-time" => 60000L,
                "max-threads" => 4,
                "min-threads" => 1,
                "queue-length" => 0
            },
            "remote-command" => {
                "keepalive-time" => 60000L,
                "max-threads" => 200,
                "min-threads" => 1,
                "queue-length" => 0
            },
            "state-transfer" => {
                "keepalive-time" => 60000L,
                "max-threads" => 60,
                "min-threads" => 1,
                "queue-length" => 0
            },
            "transport" => {
                "keepalive-time" => 60000L,
                "max-threads" => 25,
                "min-threads" => 25,
                "queue-length" => 100000
            }
        },
        "transport" => {"jgroups" => {
            "channel" => undefined,
            "cluster" => undefined,
            "executor" => undefined,
            "lock-timeout" => 60000L,
            "stack" => undefined
        }}
    }
}
