package com.restapi.restapi.service;

import com.restapi.restapi.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    User createUser(User user);
    User updateUser(Long userId, User userRequest);
    ResponseEntity<?> deleteUser(Long userId);
    List<User> getAllUsers();
}
