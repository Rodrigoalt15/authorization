package com.jwt.authorization.services;

import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;

public interface JwtService {

    public abstract String extractUsername(String token);

    public abstract <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

    public abstract String generateToken(UserDetails userDetails);

    public abstract String generateToken(Map<String, Object> extraClaims,
            UserDetails userDetails);

    public abstract String generateRefreshToken(UserDetails userDetails);

    public abstract boolean isTokenValid(String token, UserDetails userDetails);

}
