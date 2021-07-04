package com.restapi.restapi.controller;

import com.restapi.restapi.model.User;
import com.restapi.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("User")
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(name = "id") Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User resource)  {
        return userService.createUser(resource);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable(name = "id") Long userId, @Valid @RequestBody User resource) {
        return userService.updateUser(userId, resource);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(name = "id") Long userId) {
        return userService.deleteUser(userId);
    }
}
