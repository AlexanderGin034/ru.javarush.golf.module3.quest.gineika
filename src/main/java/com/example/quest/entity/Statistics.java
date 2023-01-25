package com.example.quest.entity;

import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;


@Getter
public class Statistics {
    private String nameUser;
    private int countGame = 0;
    private int win = 0;
    private int lost = 0;

    public Statistics(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setCountGame() {
        countGame++;
    }

    public void setWin() {
        win++;
    }

    public void setLost() {
        lost++;
    }

}
