package com.api.RFIND_api.RFIND_api.DTO.Request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public record EnterpriseRequest(
        @NotBlank(message = "The ID field is required")
        Long id,
        @NotBlank(message = "The CNPJ field is required")
        String cnpj,
        @NotBlank(message = "The name field is required")
        String name,
        @Email
        @NotBlank(message = "The Email field is required")
        String email,
        @NotBlank(message = "The password is required")
        @Size(min = 6, message = "The password must be at least 6 characteres long")
        String password
) {
}
