package com.example.domain.review;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ReviewMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long reviewId;
    @Column(nullable = false)
    private String menuName;
    @Column(nullable = false)
    private String menuCount;
}
