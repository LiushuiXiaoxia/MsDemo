<!-- TOC -->

- Spring Cloud Demo
- Gateway
    - Zuul
- Service Discovery
    - Eureka
    - Zookeeper
- Biz
    - Client
    - Service
- Trace
    - Zipkin
- Config
    - Apollo

<!-- /TOC -->

# Spring Cloud Demo

---

# Gateway

## Zuul

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

# Biz


## Client

http://127.0.0.1:8030/swagger-ui.html


## Service

http://127.0.0.1:8040/swagger-ui.html

# Trace

## Zipkin

http://127.0.0.1:9411/zipkin/

```bash
docker run -d -p 9411:9411 --name zipkin-server openzipkin/zipkin 
```

# Config

## Apollo

https://github.com/ctripcorp/apollo/wiki/Apollo-Quick-Start-Docker%E9%83%A8%E7%BD%B2


```bash
cd z/config
docker-compose up
```