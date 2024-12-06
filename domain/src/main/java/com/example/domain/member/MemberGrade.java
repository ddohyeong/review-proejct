package com.example.domain.member;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class MemberGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long memberId;
    @Column(nullable = false)
    private Grade grade;
    @Column(nullable = false)
    private Long numberOfReviewsWritten;
    @Column(nullable = false)
    private Long totalNumberOfSpends;
    @Column(nullable = false)
    private LocalDateTime updateTime;
}
