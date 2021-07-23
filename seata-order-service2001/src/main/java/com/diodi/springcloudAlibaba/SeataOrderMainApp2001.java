package com.diodi.springcloudAlibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author diodi
 * @create 2021-07-22-12:23
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class SeataOrderMainApp2001 {
    public static void main(String[] args) {
        SpringApplication.run( SeataOrderMainApp2001.class,args);
        System.out.println("**********服务启动成功**********");
    }
}
