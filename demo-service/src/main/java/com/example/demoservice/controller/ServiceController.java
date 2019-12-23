package com.example.demoservice.controller;

import com.example.demoservice.config.ServiceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(("/test"))
@RefreshScope
public class ServiceController {

    @Value("${server.port}")
    int port;

    @Autowired
    ServiceConfig config;

    @RequestMapping(method = RequestMethod.GET)
    public Object test() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("msg", "Hello world form demo service");
        map.put("port", port);
        map.put("config", config);

        log.info("map = {}", map);

        return map;
    }
}