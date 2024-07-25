package com.david.taskuserservice.service;

import com.david.taskuserservice.model.User;

import java.util.List;

public interface UserService {

    public User getUserProfile(String jwt);
    public List<User> getAllUsers();

}
