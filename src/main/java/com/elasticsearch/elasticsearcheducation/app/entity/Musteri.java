package com.elasticsearch.elasticsearcheducation.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "musteri")
@TypeAlias("musteriClass")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Musteri {

    @Id
    String id;

    @Field(name = "first_name")
    String firstName;

    @Field(name = "last_name")
    String lastName;

    @Field(name = "age")
    int age;

    @Transient
    String fullName;

    @Field(name = "is_active")
    Boolean isActive;


}
