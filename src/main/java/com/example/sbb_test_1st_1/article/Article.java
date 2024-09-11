package com.example.sbb_test_1st_1.article;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 250)
    private String title;

    @Column( columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createdDate;
}
