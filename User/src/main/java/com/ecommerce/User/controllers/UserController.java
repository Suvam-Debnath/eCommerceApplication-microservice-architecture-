package com.ecommerce.User.controllers;

import com.ecommerce.User.dto.UserRequest;
import com.ecommerce.User.dto.UserResponse;
import com.ecommerce.User.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        return new ResponseEntity<>(userService.fetchAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String id){
        return userService.fetchUser(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest){
        userService.addUser(userRequest);
        return ResponseEntity.ok("User added successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable String id,
                                             @RequestBody UserRequest updatedUserRequest){
        boolean updated = userService.updateUser(id,updatedUserRequest);
        if (updated) return ResponseEntity.ok("User updated successfully");
        return ResponseEntity.notFound().build();
    }
}
