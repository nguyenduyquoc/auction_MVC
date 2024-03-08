package com.ndquoc.spring_mvc_auction.dto.product;

import com.ndquoc.spring_mvc_auction.dto.category.CategoryDTO;
import com.ndquoc.spring_mvc_auction.dto.productImage.ProductImageDTO;
import com.ndquoc.spring_mvc_auction.dto.user.UserDTO;
import com.ndquoc.spring_mvc_auction.entity.User;

import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {

    private int id;

    private String name;

    private String thumbnail;

    private String description;

    private String status;

    private String created_at;

    private String updated_at;

    private CategoryDTO category;

    private List<ProductImageDTO> images;

    private UserDTO seller;
}
