package org.example.classwork.controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class userController {
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") String id) {
        // Return a message with the user ID
        return "User with ID " + id + " found";
    }
}
