package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.model.User;
import com.example.pp_3_1_1_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUser(Long id) {
        return userRepository.getById(id);
    }


    @Override
    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }



}

