package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserRepository userRepository;


    @Autowired
public UserController(UserRepository repo){
        this.userRepository=repo;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id){
return userRepository.findById(id);
    }


    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

}
