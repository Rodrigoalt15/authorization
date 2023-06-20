package com.jwt.authorization.services;

import java.util.List;

import com.jwt.authorization.models.User;

public interface UserService {

    public abstract List<User> getAllUsers();

}
