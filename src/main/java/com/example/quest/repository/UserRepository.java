package com.example.quest.repository;


import com.example.quest.entity.Statistics;
import com.example.quest.entity.User;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> users = new HashMap<String, User>(){{
        put("Admin", new User("Admin", "111", new Statistics("Админ", 0)));
        put("Гость", null);
    }};

    @Getter private final UserRepository userRepository = new UserRepository();

    private UserRepository(){}

    public boolean creat(User user){
        if(!checkUserName(user)) {
            users.put(user.getName(), user);
            return true;
        }
        else {
            return false;
        }
    }

    public User read(User user){
        return users.get(user.getName());
    }

    public void delete(User user){
        users.remove(user.getName());
    }

    public void updatePassword(User user, String newPassword){
        User userForUpdate = users.get(user.getName());
        userForUpdate.setPassword(newPassword);
    }

    public  boolean checkUserName(User userOut){
        return users.entrySet()
                .stream()
                .anyMatch(user -> user.getKey() == userOut.getName());
    }

    public boolean checkUserPassword(User userOut){
        return users.entrySet()
                .stream()
                .anyMatch(user -> user.getKey() == userOut.getName()
                        && user.getValue().getPassword() == userOut.getPassword());
    }
}
