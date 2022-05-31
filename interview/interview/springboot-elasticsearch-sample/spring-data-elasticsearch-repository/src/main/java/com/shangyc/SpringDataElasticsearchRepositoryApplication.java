package com.shangyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataElasticsearchRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataElasticsearchRepositoryApplication.class, args);
    }
    // 正常启动需更改springboot版本为  <version>2.1.1.RELEASE</version>
}
