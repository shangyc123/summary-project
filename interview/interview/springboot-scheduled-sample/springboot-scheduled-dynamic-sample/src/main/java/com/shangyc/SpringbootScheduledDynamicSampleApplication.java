package com.shangyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //开启定时任务
@SpringBootApplication
public class SpringbootScheduledDynamicSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootScheduledDynamicSampleApplication.class, args);
    }

}
