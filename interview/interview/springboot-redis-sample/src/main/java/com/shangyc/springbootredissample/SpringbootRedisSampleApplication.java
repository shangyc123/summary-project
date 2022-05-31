package com.shangyc.springbootredissample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootRedisSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisSampleApplication.class, args);
    }

}
