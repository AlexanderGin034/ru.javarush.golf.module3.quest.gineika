package com.example.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Quest {
    private final List<Quest> quests = new ArrayList<>();

}
