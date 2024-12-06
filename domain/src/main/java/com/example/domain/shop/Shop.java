package com.example.domain.shop;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long ownerId;
    @Column(nullable = false)
    private String shopName;
}
