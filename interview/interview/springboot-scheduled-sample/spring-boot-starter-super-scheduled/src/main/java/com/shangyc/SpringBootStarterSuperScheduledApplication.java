package com.shangyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootStarterSuperScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterSuperScheduledApplication.class, args);
    }

}
