package com.jwt.authorization.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.authorization.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findAll();
}
