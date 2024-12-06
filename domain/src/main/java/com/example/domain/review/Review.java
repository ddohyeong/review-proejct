package com.example.domain.review;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long memberId;
    @Column(nullable = false)
    private Long orderId;
    @Column(nullable = false)
    private Long shopId;
    @Column(nullable = false)
    private Long rating;
    private String content;
    @Column(nullable = false)
    private LocalDateTime createTime;
    private LocalDateTime deleteTime;
    @Column(nullable = false)
    private Boolean deleted;
    private ReviewStatus reviewStatus;
}
