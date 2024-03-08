package com.ndquoc.spring_mvc_auction.dto.user;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserCreateDTO {

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "First Name must not be blank")
    @Size(min = 2, message = "First Name must be at least 2 characters")
    private String first_name;

    @NotBlank(message = "Last Name must not be blank")
    @Size(min = 2, message = "Last Name must be at least 2 characters")
    private String last_name;

    @NotBlank(message = "Password must not be blank")
    @Size(min = 8, message = "Password must be at least 8 characters")
    @Pattern(regexp="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", message="Password must contain at least one letter, one number, and one special character")
    private String password;

    private String confirmPassword;

    @AssertTrue(message = "You must agree to terms and conditions")
    private boolean termsAccepted;
}
