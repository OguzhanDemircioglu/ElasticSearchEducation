package com.elasticsearch.elasticsearcheducation.app.config;

//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//
//@Service
//public class ElasticsearchService {
//
//    private final DynamicElasticsearchConnector connector;
//
//    public ElasticsearchService(DynamicElasticsearchConnector connector) {
//        this.connector = connector;
//    }
//
//    public void performSearchOperation() {
//        ElasticsearchClient client = connector.getClient();
//        if (client != null) {
//            try {
//                // Elasticsearch işlemleri burada yapılır
//                var response = client.info();
//                System.out.println("Elasticsearch Cluster Adı: " + response.clusterName());
//            } catch (IOException e) {
//                System.err.println("Elasticsearch işlemi sırasında hata: " + e.getMessage());
//            }
//        } else {
//            System.out.println("Elasticsearch şu anda bağlı değil. İşlem beklemeye alınabilir.");
//        }
//    }
//}
