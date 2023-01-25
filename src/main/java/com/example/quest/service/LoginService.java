package com.example.quest.service;

public class LoginService {
    private String login;
    private String password;
    private final UserService userRepository;

    public LoginService(String login, String password) {
        this.login = login;
        this.password = password;
        userRepository  = UserService.getUserRepository();
    }
}
