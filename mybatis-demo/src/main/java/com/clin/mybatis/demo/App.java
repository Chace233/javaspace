package com.clin.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.clin.mybatis.demo")
@EntityScan("com.clin.mybatis.demo.entity")
@MapperScan("com.clin.mybatis.demo.dao")
public class App {

    /**
     * web项目入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
