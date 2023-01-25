package com.example.quest.service;

import com.example.quest.entity.User;
import com.example.quest.repository.UserRepository;

import java.util.Optional;

public class UserService {
    public static final UserRepository userRepository = UserRepository.getUserRepository();
    private static final UserService userService = new UserService();

    private UserService(){

    }

    public static UserService getUserRepository(){
        return userService;
    }

    public void creat(User user){
        userRepository.creat(user);
    }

    public Optional<User> find(String name){
        return userRepository.find(name);
    }

    public void delete(User user){
        userRepository.delete(user);
    }

    public void updatePassword(User user, String newPassword){
        userRepository.updatePassword(user, newPassword);
    }

    public boolean checkUser(User user, String pass){
        return userRepository.checkUser(user, pass);
    }
}
