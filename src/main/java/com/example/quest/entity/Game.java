package com.example.quest.entity;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Game {
    User user;
    HttpSession currentSession;
}
