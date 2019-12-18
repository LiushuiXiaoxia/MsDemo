package com.example.demoservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(("/test"))
public class ServiceController {

    @Value("${server.port}")
    int port;

    @RequestMapping
    public String test() {
        String s = "Hello world form demo service." + port;

        log.info(s);

        return s;
    }
}