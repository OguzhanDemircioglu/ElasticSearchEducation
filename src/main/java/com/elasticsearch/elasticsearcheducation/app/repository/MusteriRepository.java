package com.elasticsearch.elasticsearcheducation.app.repository;

import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends ElasticsearchRepository<Musteri, String> {
}
