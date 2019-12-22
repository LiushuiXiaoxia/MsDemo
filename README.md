# Spring Cloud Demo

---

# Zuul(Gateway)

8010

http://localhost:8010/client/client/test?token=abc123

http://localhost:8010/client/client/feign?token=abc123

# Service Discovery

## Eureka

8020

http://localhost:8020/

## Zookeeper

```bash
docker run --name my-zookeeper -d zookeeper
```

# Client

8030

# Service

8040

# Zipkin

http://127.0.0.1:9411/zipkin/

```bash
docker run -d -p 9411:9411 --name zipkin-server openzipkin/zipkin 
```