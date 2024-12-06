package com.example.domain.order;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class OrderMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    @Column(nullable = false)
    private String menuName;
    @Column(nullable = false)
    private String menuCount;
    @Column(nullable = false)
    private String menuPrice;
    @Column(nullable = false)
    private Boolean deleted;
}
