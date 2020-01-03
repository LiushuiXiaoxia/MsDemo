<!-- TOC -->

- Spring Cloud Demo
- Nginx
    - hosts
    - nginx
- Gateway
    - Zuul
- Service Discovery
    - Eureka
    - Zookeeper
    - Consul
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

# Nginx 

## hosts

```bash
# micro service demo
127.0.0.1 msdemo.com
```

http://msdemo.com

## nginx

```nginx
upstream ms_gateway {
	server                 127.0.0.1:8010;
}

server {
	listen                 80;
	server_name            msdemo.com;
	access_log             /usr/local/var/log/nginx/msdemo.log;
	error_log              /usr/local/var/log/nginx/msdemo-error.log;

	location / {
		proxy_pass            http://ms_gateway;
		proxy_set_header      Host $host; # 保留代理之前的host
		proxy_set_header      X-Real-IP $remote_addr; # 保留代理之前的真实客户端ip
		index                 index.html index.htm;
		client_max_body_size  150M;
	}
}
```

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

## Consul

```bash
brew install consul
consul agent -dev -advertise 127.0.0.1
```

http://localhost:8500

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


http://localhost:8070/
apollo / admin

```bash
cd z/config
docker-compose up
```