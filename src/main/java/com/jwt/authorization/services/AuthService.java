package com.jwt.authorization.services;

import com.jwt.authorization.dtos.AuthenticationResponse;
import com.jwt.authorization.dtos.LoginRequest;
import com.jwt.authorization.dtos.RegisterRequest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AuthService {

    public abstract AuthenticationResponse register(RegisterRequest registerRequest);

    public abstract AuthenticationResponse login(LoginRequest loginRequest);

    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
