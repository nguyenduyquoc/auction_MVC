package com.ndquoc.spring_mvc_auction.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", unique = true)
    @NotBlank(message = "Phone Number must not be blank")
    @Pattern(regexp="(^$|[0-9]{10,11})", message="Phone Number must be 10 or 11 digits")
    private String phone_number;

    private String avatar;

    @Column(nullable = false)
    private String password;

    private String address;

    @Column(name = "amount_of_money", nullable = false, precision = 16, scale = 2)
    private BigDecimal amountOfMoney = BigDecimal.ZERO;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    @CreatedDate
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

}

/*
@Column(name = "phone_number", unique = true)
@NotBlank(message = "Phone Number must not be blank")
@Pattern(regexp="(^$|[0-9]{10,11})", message="Phone Number must be 10 or 11 digits")
private String phone_number;*/
