package com.example.domain.shop;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ShopStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long shopId;
    @Column(nullable = false)
    private Long shopAmount;
}
