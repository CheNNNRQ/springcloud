package com.diodi.springcloudAlibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author diodi
 * @create 2021-07-16-20:46
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run( PaymentMain9001.class,args);
        System.out.println("**********服务启动成功**********");
    }
}
