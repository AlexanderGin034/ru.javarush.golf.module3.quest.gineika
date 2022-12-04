package com.example.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Answer {
    private final Long id;
    private final String text;
    private final Question question;

    private boolean isWin;

    private String result;

    public Answer(String text, boolean isWin, Question question, String result){
        this.text = text;
        this.question = question;
        this.id = question.getId();
        this.isWin = isWin;
        this.result = result;
    }
}
