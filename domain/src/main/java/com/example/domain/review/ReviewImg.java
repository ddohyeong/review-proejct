package com.example.domain.review;

import jakarta.persistence.*;

@Entity
public class ReviewImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long reviewId;
    @Column(nullable = false)
    private String imgUrl;
}
