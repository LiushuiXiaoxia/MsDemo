package com.example.democlient.controller;

import cn.mycommons.javalib.ITestApi;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.democlient.api.IFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IFeignApi feignApi;

    @RequestMapping("/feign")
    public String callService() {
        return feignApi.test();
    }

    @RequestMapping("/test")
    public String test() {
        return "client test success.";
    }


    @Value("${msg:abc123}")
    String msg;

    @RequestMapping("/apollo")
    public String apollo() {
        return msg;
    }

    @Reference
    ITestApi testApi;

    @RequestMapping("/dubbo")
    public String testDubbo(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(testApi.add(a, b));
    }
}