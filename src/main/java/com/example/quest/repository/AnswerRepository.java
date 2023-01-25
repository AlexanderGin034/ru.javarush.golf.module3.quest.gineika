package com.example.quest.repository;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Question;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class AnswerRepository {
    private static final AnswerRepository ANSWER_REPO = new AnswerRepository();

   // private List<Question> questionsList = QuestionRepository.getQUESTION_REPO().getQuestionsList();

    private final List<Answer> answerList = new ArrayList(){{
        add(new Answer("Принять вызов", true, null));
        add(new Answer("Отклонить вызо", false, "Ты отклонил вызов. ПОРАЖЕНИЕ"));
        add(new Answer("Подняться на мостик", true, null));
        add(new Answer("Отказаться подниматься на мостик", false, "Ты не пошел на переговоры. ПОРАЖЕНИЕ"));
        add(new Answer("Рассказать правду о себе", true, "Тебя вернули домой. ПОБЕДА"));
        add(new Answer("Солгать о себе", false, "Твою ложь разоблачили. ПОРАЖЕНИЕ"));
    }};

    private AnswerRepository(){};

    public static AnswerRepository getANSWER_REPO(){
        return ANSWER_REPO;
    }

    public List<Answer> getAnswerList(){
        return answerList;
    }
}
