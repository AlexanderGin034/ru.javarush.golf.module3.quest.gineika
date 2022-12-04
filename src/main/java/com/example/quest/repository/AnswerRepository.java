package com.example.quest.repository;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Question;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class AnswerRepository {
    private static final AnswerRepository ANSWER_REPO = new AnswerRepository();

    private List<Question> questionsList = QuestionRepository.getQUESTION_REPO().getQuestionsList();

    public final List<Answer> answerList = new ArrayList(){{
        add(new Answer("Принять вызов", true, questionsList.get(0), null));
        add(new Answer("Отклонить вызо", false, questionsList.get(0), "Ты отклонил вызов. ПОРАЖЕНИЕ"));
        add(new Answer("Подняться на мостик", true, questionsList.get(1), null));
        add(new Answer("Отказаться подниматься на мостик", false, questionsList.get(1), "Ты не пошел на переговоры. ПОРАЖЕНИЕ"));
        add(new Answer("Рассказать правду о себе", true, questionsList.get(2), "Тебя вернули домой. ПОБЕДА"));
        add(new Answer("Солгать о себе", false, questionsList.get(2), "Твою ложь разоблачили. ПОРАЖЕНИЕ"));
    }};

    private AnswerRepository(){};

    public static AnswerRepository getANSWER_REPO(){
        return ANSWER_REPO;
    }
}
