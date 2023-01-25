package com.example.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Question {
    private final long id;
    private final String text;
    private final List<Answer> answers;
    private final Long beforeQuestion;
    private final Long afterQuestion;
}
