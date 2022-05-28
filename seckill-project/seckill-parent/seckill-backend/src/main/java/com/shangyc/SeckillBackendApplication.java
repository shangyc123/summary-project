package com.shangyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shangyc.dao")
public class SeckillBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillBackendApplication.class, args);
    }

}
