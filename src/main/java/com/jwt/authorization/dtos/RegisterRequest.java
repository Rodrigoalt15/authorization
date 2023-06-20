package com.jwt.authorization.dtos;

import com.jwt.authorization.models.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Role role;
}
