package com.elasticsearch.elasticsearcheducation.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.w3c.dom.ranges.Range;

@Document(indexName = "musteri")
@TypeAlias("musteriClass")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Musteri {

    @Id
    String id;

    @Field(name = "musteri_adi")
    String name;

    @Field(type = FieldType.Integer_Range)
    Range validAge;
}
