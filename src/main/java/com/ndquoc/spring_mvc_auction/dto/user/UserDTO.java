package com.ndquoc.spring_mvc_auction.dto.user;

import com.ndquoc.spring_mvc_auction.entity.Role;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO {

    private int id;

    private String first_name;

    private String last_name;

    private String email;

    private String phone_number;

    private String avatar;

    private String address;

    private BigDecimal amountOfMoney;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

//    private List<Product> products;

    private Set<Role> roles = new HashSet<>();
}
