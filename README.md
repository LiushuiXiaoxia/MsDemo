# Spring Cloud Demo

---

# Zuul(Gateway)

8010

http://localhost:8010/client/client/test?token=abc123

# Eureka

8020

http://localhost:8020/

# Client

8030

# Service

8040

# Zipkin

http://127.0.0.1:9000/zipkin/

```bash
docker run -d -p 9000:9411 --name zipkin-server openzipkin/zipkin 
```