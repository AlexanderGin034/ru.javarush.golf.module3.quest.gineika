package com.example.quest.repository;


import com.example.quest.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();

    public static boolean checkUser(User userOut){
        return users.stream().anyMatch(user -> user.getName() == userOut.getName());
    }
}
