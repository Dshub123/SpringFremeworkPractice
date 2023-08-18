package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    private List<User> userList = new ArrayList<>();

    public UserServiceImpl() {
        userList.add(new User(UUID.randomUUID().toString(),"Shubham","shubham@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"John","john@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Martin","martin@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Alex","Alex@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.userList;
    }
}
