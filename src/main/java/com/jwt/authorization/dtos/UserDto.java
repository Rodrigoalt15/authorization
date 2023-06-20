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
public class UserDto {
    private String name;
    private String lastname;
    private String email;
    private Role role;
}
