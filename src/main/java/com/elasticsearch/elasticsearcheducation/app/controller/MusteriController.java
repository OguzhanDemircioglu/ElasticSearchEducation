package com.elasticsearch.elasticsearcheducation.app.controller;

import com.elasticsearch.elasticsearcheducation.app.entity.Musteri;
import com.elasticsearch.elasticsearcheducation.app.repository.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/musteri")
public class MusteriController {
    private final MusteriRepository repository;

    @GetMapping
    public void save(){
        repository.save(Musteri.builder().name("Oguz").build());
    }
}
