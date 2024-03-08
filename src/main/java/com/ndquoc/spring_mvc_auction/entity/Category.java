package com.ndquoc.spring_mvc_auction.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    private String icon;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @Column(name = "is_deleted", nullable = false)
    private boolean is_deleted = Boolean.FALSE;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

}