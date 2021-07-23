package com.diodi.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author diodi
 * @create 2021-07-11-18:53
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLog(){
        return Logger.Level.FULL;
    }
}
