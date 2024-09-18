package org.example.classwork.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class userUpdate {

    private Map<Long, User> users = new HashMap<>();


    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User updatedUser) {

        if (users.containsKey(id)) {
            User existingUser = users.get(id);

            existingUser.setName(updatedUser.getName());
            existingUser.setAge(updatedUser.getAge());

            return "User with ID " + id + " has been updated.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }
}

class User {
    private String name;
    private int age;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
