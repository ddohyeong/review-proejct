package com.example.domain.member;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String loginId;
    @Column(nullable = false)
    private String password;
}
