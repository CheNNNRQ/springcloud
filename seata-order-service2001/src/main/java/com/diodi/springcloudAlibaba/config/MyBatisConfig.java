package com.diodi.springcloudAlibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author diodi
 * @create 2021-07-22-12:18
 */
@Configuration
@MapperScan({"com.diodi.springcloudAlibaba.dao"})
public class MyBatisConfig {
}
