package com.example.democlient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @FeignClient(value = "demo-service", url = "http://127.0.0.1:8022")
@FeignClient(value = "demo-service")
public interface IFeignApi {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
}