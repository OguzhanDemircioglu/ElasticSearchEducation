package com.elasticsearch.elasticsearcheducation.app.config;

//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.elasticsearch.core.InfoResponse;
//import co.elastic.clients.transport.rest_client.RestClientTransport;
//import co.elastic.clients.json.jackson.JacksonJsonpMapper;
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.retry.annotation.Backoff;
//import org.springframework.retry.annotation.Retryable;
//
//@Configuration
//public class ElasticsearchConfig {
//
//    @Value("${elasticsearch.url:localhost:9200}")
//    private String elasticsearchUrl;
//
//    @Bean
//    @Retryable(
//            value = {Exception.class},
//            maxAttempts = 5,
//            backoff = @Backoff(delay = 2000, multiplier = 2))
//    public ElasticsearchClient elasticsearchClient() {
//        try {
//            RestClient restClient = RestClient.builder(HttpHost.create(elasticsearchUrl)).build();
//            RestClientTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
//            return new ElasticsearchClient(transport);
//        } catch (Exception e) {
//            throw new RuntimeException("Elasticsearch bağlantısı kurulamadı: " + e.getMessage(), e);
//        }
//    }
//}
//
