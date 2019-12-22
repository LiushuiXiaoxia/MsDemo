package com.example.democlient.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * MyConfig <br/>
 * Created by xiaqiulei on 2019-12-22.
 */
@Data
@Component
public class MyConfig {

    @Value("${myconfig.timeout}")
    private long timeout;

    @Value("${myconfig.hello}")
    private String hello;
}