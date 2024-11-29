package com.elasticsearch.elasticsearcheducation.app.config;

//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.transport.rest_client.RestClientTransport;
//import co.elastic.clients.json.jackson.JacksonJsonpMapper;
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//@Service
//public class DynamicElasticsearchConnector {
//
//    @Value("${elasticsearch.url:localhost:9200}")
//    private String elasticsearchUrl;
//
//    private ElasticsearchClient elasticsearchClient;
//
//    public ElasticsearchClient getClient() {
//        return elasticsearchClient;
//    }
//
//    @Scheduled(fixedDelay = 10000) // Her 10 saniyede bir kontrol eder
//    public void checkAndReconnect() {
//        if (elasticsearchClient == null) {
//            try {
//                RestClient restClient = RestClient.builder(HttpHost.create(elasticsearchUrl)).build();
//                RestClientTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
//                elasticsearchClient = new ElasticsearchClient(transport);
//
//                // Elasticsearch'ün bilgi endpoint'ine istek atarak bağlantıyı doğrulayın
//                elasticsearchClient.info();
//            } catch (IOException e) {
//                elasticsearchClient = null; // Bağlantı başarısız olursa null olarak bırak
//            }
//        }
//    }
//}
