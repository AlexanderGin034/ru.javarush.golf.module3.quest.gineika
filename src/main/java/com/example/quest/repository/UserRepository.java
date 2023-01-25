package com.example.quest.repository;


import com.example.quest.entity.Role;
import com.example.quest.entity.Statistics;
import com.example.quest.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private final Map<String, User> users = new HashMap<String, User>(){{
        put("Admin", new User("Admin", "111", Role.ADMIN, new Statistics("Admin")));
        put("Guest", new User("Guest","null", Role.GUEST, null));
        put("User", new User("User", "111", Role.USER, new Statistics("User")));
    }};

    private static final UserRepository userRepository = new UserRepository();

    private UserRepository(){}

    public static UserRepository getUserRepository(){
        return userRepository;
    }

    public void creat(User user){
        users.put(user.getName(), user);
    }

    public Optional<User> find(String name){
        return Optional.ofNullable(users.get(name));
    }

    public void delete(User user){
        users.remove(user.getName());
    }

    public void updatePassword(User user, String newPassword){
        User userForUpdate = users.get(user.getName());
        userForUpdate.setPassword(newPassword);
    }

    public boolean checkUser(User userOut, String pass){
        if(!checkUserName(userOut) || !checkUserPassword(userOut, pass)){
            return false;
        }
        return true;
    }

    private boolean checkUserName(User userOut){
        return users.entrySet()
                .stream()
                .anyMatch(user -> user.getKey().equals(userOut.getName()));
    }

    private boolean checkUserPassword(User userOut, String pass){
        return users.entrySet()
                .stream()
                .anyMatch(user -> user.getKey() == userOut.getName()
                        && user.getValue().getPassword().equals(pass));
    }
}
