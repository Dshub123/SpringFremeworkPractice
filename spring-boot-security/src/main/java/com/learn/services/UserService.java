package com.learn.services;

import com.learn.SpringBootSecurityApplication;
import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//Creating fake service to demonstrate spring security:----
@Service
public class UserService {


    private List<User> userList = new ArrayList<>();

    public UserService(){
        userList.add(new User("shubham","shubham","shubham@gmail.com"));
        userList.add(new User("abc","abc","abc@gmail.com"));
        userList.add(new User("xyz","xyz","xyz@gmail.com"));
    }

    //Get all users
    public List<User> getAllUsers(){
        return this.userList;
    }

    //Get single user
    public User getUserByUsername(String username){
        //find any method will return user object orElse null is returned
        return this.userList.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    //Add new user
    public User addNewUser(User user){
        this.userList.add(user);
        return user;
    }
}
