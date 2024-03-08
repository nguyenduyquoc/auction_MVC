package com.ndquoc.spring_mvc_auction.dto.category;

import com.ndquoc.spring_mvc_auction.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {

    private int id;

    private String name;

    private String icon;

    private String created_at;

    private String updated_at;

    private boolean is_deleted;

    //private List<Product> products;

}