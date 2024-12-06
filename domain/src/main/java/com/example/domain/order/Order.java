package com.example.domain.order;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long reviewId;
    @Column(nullable = false)
    private Long memberId;
    @Column(nullable = false)
    private Long shopId;
    @Column(nullable = false)
    private OrderStatus orderStatus;
    @Column(nullable = false)
    private LocalDateTime orderDate;
    @Column(nullable = false)
    private Boolean deleted;
}
