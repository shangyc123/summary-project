package com.shangyc.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.http.HttpHeaders;

// 官方推荐写法
//@Configuration
//public class EsConfig extends AbstractElasticsearchConfiguration {
//    @Override
//    @Bean
//    public RestHighLevelClient elasticsearchClient() {
//
//        HttpHeaders defaultHeaders = new HttpHeaders();
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("http://47.111.24.105:9200/")
//                .withDefaultHeaders(defaultHeaders)
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//}
