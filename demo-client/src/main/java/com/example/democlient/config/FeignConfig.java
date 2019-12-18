package com.example.democlient.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        log.info("host = " + host);
        log.info("dKey = " + dKey);

        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                log.info("url = {}", template.url());
            }
        };
    }

    @Value("${msg:abc123}")
    String host;

    @Value("${default_key:hehe}")
    String dKey;


//    @Bean
//    public EurekaClientConfigBean eurekaClientConfigBean() {
//        log.info("host = " + host);
//
//        EurekaClientConfigBean bean = new EurekaClientConfigBean();
//        Map<String, String> map = new HashMap<>();
//        map.put("defaultZone", host);
//        bean.setServiceUrl(map);
//
//        return bean;
//    }
}
