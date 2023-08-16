package com.learn.controllers;

import com.learn.models.User;
import com.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //all users
    @GetMapping("/allusers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //get by username
    @GetMapping("/user/{username}")
    public User getByUsername(@PathVariable("username") String uname){
        return userService.getUserByUsername(uname);
    }

    //add new user
    @PostMapping("/newuser")
    public User addNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }
}
