package com.elasticsearch.elasticsearcheducation.app.controller;

import com.elasticsearch.elasticsearcheducation.app.domain.MusteriInsertDto;
import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import com.elasticsearch.elasticsearcheducation.app.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Future;

import static com.elasticsearch.elasticsearcheducation.app.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MUSTERI)
public class MusteriController {
    private final MusteriService service;

    @PostMapping(INSERT)
    public ResponseEntity<Musteri> insert(@RequestBody MusteriInsertDto dto) {
        return ResponseEntity.ok(service.insert(dto));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(findAllByFirstNameLike)
    public ResponseEntity<?> findAllByFirstNameLike(String firstName) {
        return ResponseEntity.ok(service.findAllByFirstNameLike(firstName));
    }

    @GetMapping(findAllByFirstNameLikePages)
    public ResponseEntity<?> findAllByFirstNameLikePages(@RequestParam String firstName,
                                                         @RequestParam int page,
                                                         @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(service.findAllByFirstNameLikePages(firstName, pageable));
    }

    @GetMapping(findByFirstNameUsingCustomQuery)
    public ResponseEntity<?> findByFirstNameUsingCustomQuery(String firstName) {
        return ResponseEntity.ok(service.findByFirstNameUsingCustomQuery(firstName));
    }

    @GetMapping(findTop5AllByFirstNameAndLastName)
    public ResponseEntity<?> findTop5AllByFirstNameAndLastName(String firstName, String lastName) {
        return ResponseEntity.ok(service.findTop5AllByFirstNameAndLastName(firstName, lastName));
    }

    @GetMapping(streamByIsActiveTrue)
    public ResponseEntity<?> streamByIsActiveTrue() {
        return ResponseEntity.ok(service.streamByIsActiveTrue());
    }

    @GetMapping(findAllByAge)
    public ResponseEntity<Future<Iterable<Musteri>>> findAllByAge(int age) {
        return ResponseEntity.ok(service.findAllByAge(age));
    }

    @GetMapping(findByAgeGreaterThan)
    public ResponseEntity<Page<Musteri>> findByAgeGreaterThan(@RequestParam int age,
                                                              @RequestParam int page,
                                                              @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(service.findByAgeGreaterThan(age, pageable));
    }

}
