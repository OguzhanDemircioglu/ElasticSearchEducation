package com.elasticsearch.elasticsearcheducation.app.service;

import com.elasticsearch.elasticsearcheducation.app.domain.MusteriInsertDto;
import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface MusteriService {
    Musteri insert(MusteriInsertDto musteri);

    Iterable<Musteri> getAll();

    Iterable<Musteri> findAllByFirstNameLike(String firstName);

    Page<Musteri> findAllByFirstNameLikePages(String firstName, Pageable pageable);

    Iterable<Musteri> findByFirstNameUsingCustomQuery(String firstName);

    Iterable<Musteri> findTop5AllByFirstNameAndLastName(String firstName, String lastName);

    Future<Iterable<Musteri>> findAllByAge(Integer age);

    Stream<Musteri> streamByIsActiveTrue();

    Page<Musteri> findByAgeGreaterThan(int age, Pageable pageable);
}
