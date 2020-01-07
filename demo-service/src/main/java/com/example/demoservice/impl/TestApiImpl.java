package com.example.demoservice.impl;

import cn.mycommons.javalib.ITestApi;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Service
public class TestApiImpl implements ITestApi {

    @Override
    public int add(int a, int b) {
        int r = a + b;
        log.info("add a = {}, b = {}, r = {}", a, b, r);

        return r;
    }
}