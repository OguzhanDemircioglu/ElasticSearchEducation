package com.elasticsearch.elasticsearcheducation.app.service.srvImpl;

import com.elasticsearch.elasticsearcheducation.app.domain.MusteriInsertDto;
import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import com.elasticsearch.elasticsearcheducation.app.repository.MusteriRepository;
import com.elasticsearch.elasticsearcheducation.app.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class MusteriSrvImpl implements MusteriService {
    private final MusteriRepository repository;

    @Override
    public Musteri insert(MusteriInsertDto dto) {
        return repository.save(
                Musteri.builder()
                        .firstName(dto.getFirstName())
                        .lastName(dto.getLastName())
                        .age(dto.getAge())
                        .isActive(true)
                        .build());
    }

    @Override
    public Iterable<Musteri> getAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<Musteri> findAllByFirstNameLike(String firstName) {
        return repository.findAllByFirstNameLike(firstName);
    }

    @Override
    public Page<Musteri> findAllByFirstNameLikePages(String firstName, Pageable pageable) {
        return repository.findAllByFirstNameLikePages(firstName, pageable);
    }

    @Override
    public Iterable<Musteri> findByFirstNameUsingCustomQuery(String firstName) {
        return repository.findByFirstNameUsingCustomQuery(firstName);
    }

    @Override
    public Iterable<Musteri> findTop5AllByFirstNameAndLastName(String firstName, String lastName) {
        return repository.findTop5AllByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Future<Iterable<Musteri>> findAllByAge(Integer age) {
        return repository.findAllByAge(age);
    }

    @Override
    public Stream<Musteri> streamByIsActiveTrue() {
        return repository.streamByIsActiveTrue();
    }

    @Override
    public Page<Musteri> findByAgeGreaterThan(int age, Pageable pageable) {
        return repository.findByAgeGreaterThan(age, pageable);
    }
}
