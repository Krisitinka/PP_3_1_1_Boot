package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
}
