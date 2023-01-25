package com.example.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Answer {
    private final String text;

    private boolean isWin;

    private String result;

    public Answer(String text, boolean isWin, String result){
        this.text = text;
        this.isWin = isWin;
        this.result = result;
    }
}
