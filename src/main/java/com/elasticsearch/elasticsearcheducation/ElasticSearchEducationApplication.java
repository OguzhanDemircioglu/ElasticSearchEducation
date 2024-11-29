package com.elasticsearch.elasticsearcheducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.elasticsearch.elasticsearcheducation.app.repository")
@SpringBootApplication
public class ElasticSearchEducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchEducationApplication.class, args);
    }

}
