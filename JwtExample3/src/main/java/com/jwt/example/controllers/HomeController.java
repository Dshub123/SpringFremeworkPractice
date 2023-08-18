package com.jwt.example.controllers;

import com.jwt.example.models.User;
import com.jwt.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

//    http://localhost:9090/home/user
    @GetMapping("/user")
    public List<User> getUser()
    {
        System.out.println("Getting list of users");
        return userService.getAllUsers();
    }

//   http://localhost:9090/home/current-user
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();    //principal class represents current logged in user and get name method returns the name of the user
    }
}
