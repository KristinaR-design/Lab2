package org.example.classwork.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class deleteUsers {

    private Map<Long, User> users = new HashMap<>();



    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Check if user exists
        if (users.containsKey(id)) {
            users.remove(id);
            return "User with ID " + id + " has been deleted.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }
}

class Userdel{
    private String name;
    private int age;

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