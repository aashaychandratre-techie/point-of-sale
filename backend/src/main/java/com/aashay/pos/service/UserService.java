package com.aashay.pos.service;

import com.aashay.pos.io.UserRequest;
import com.aashay.pos.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
