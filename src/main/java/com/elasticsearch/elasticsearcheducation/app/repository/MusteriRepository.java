package com.elasticsearch.elasticsearcheducation.app.repository;

import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.concurrent.Future;
import java.util.stream.Stream;

@Repository
public interface MusteriRepository extends ElasticsearchRepository<Musteri, String> {

    @Query("""
            {
            	"bool": {
            		"must": [
            			{
            				"term": {
            					"first_name": "#{#firstName}"
            				}
            			}
            		]
            	}
            }
            """)
    Iterable<Musteri> findAllByFirstNameLike(String firstName);

    @Query("{\"match\":{\"first_name\":{\"query\":\"?0\"}}}")
    Page<Musteri> findAllByFirstNameLikePages(String firstName, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"first_name\": \"?0\"}}]}}")
    Iterable<Musteri> findByFirstNameUsingCustomQuery(String firstName);

    Iterable<Musteri> findTop5AllByFirstNameAndLastName(String firstName, String lastName);

    @Async
    Future<Iterable<Musteri>> findAllByAge(Integer age);

    Stream<Musteri> streamByIsActiveTrue();

    Page<Musteri> findByAgeGreaterThan(int age, Pageable pageable);
}
