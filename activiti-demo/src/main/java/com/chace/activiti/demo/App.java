package com.chace.activiti.demo;

import lombok.extern.slf4j.Slf4j;
import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.chace.activiti.demo", exclude = SecurityAutoConfiguration.class)
@Slf4j
@MapperScan(basePackages = {"com.chace.activiti.demo"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
