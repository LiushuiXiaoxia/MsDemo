package com.example.democlient.controller;

import com.example.democlient.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ApolloController <br/>
 * Created by xiaqiulei on 2019-12-22.
 */
@Slf4j
@RestController
public class ApolloController {

    @Value("${msg:abc123}")
    String msg;

    @Autowired
    MyConfig myConfig;

    @RequestMapping(value = "/apollo", method = RequestMethod.GET)
    public Map<String, Object> apollo() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("msg", msg);
        map.put("config", myConfig);

        log.info("map = {}", map);
        return map;
    }
}