package com.elasticsearch.elasticsearcheducation.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MusteriInsertDto {
    String firstName;
    String lastName;
    int age;
}
