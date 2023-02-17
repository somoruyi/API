package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //GET
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
//    @GetMapping("/users/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable Long id) {
//        User user = userService.getUserById(id);
//        if (user != null) {
//            return ResponseEntity.ok(user); // return a 200 OK response with the user in the response body
//        } else {
//            return ResponseEntity.notFound().build(); // return a 404 Not Found response
//        }
//    }


    //POST
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    //PUT

    //DELETE

}
