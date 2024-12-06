package com.example.domain.shop;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class MenuInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Shop shop;
    @Column(nullable = false)
    private Long menuName;
    @Column(nullable = false)
    private Long menuStock;
    @Column(nullable = false)
    private Long minMenuStock;
    private LocalDateTime updateTime;
}
