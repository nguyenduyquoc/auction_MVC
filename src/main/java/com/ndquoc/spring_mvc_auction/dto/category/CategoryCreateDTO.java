package com.ndquoc.spring_mvc_auction.dto.category;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class CategoryCreateDTO {

    private int id;

    @NotBlank(message = "Category name must not be blank")
    private String name;

    private MultipartFile icon;

}
