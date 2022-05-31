package com.shangyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataElasticsearchClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataElasticsearchClientApplication.class, args);
    }

    // 正常启动需更改springboot版本为  <version>2.4.1</version>
}
