package com.diodi.springcloud;

import com.sun.jmx.snmp.agent.SnmpMibAgentMBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author diodi
 * @create 2021-07-11-12:09
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run( OrderFeignMain80.class,args);
    }
}
