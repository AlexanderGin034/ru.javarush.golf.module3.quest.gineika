package com.example.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Question {
    @Getter private final long id;
    private final String text;
    //private final List<Answer> answers;
}
