package com.diodi.springcloudAlibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author diodi
 * @create 2021-07-17-12:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run( NacosConfigClientMain3377.class,args);
        System.out.println("**********服务启动成功**********");
    }
}
