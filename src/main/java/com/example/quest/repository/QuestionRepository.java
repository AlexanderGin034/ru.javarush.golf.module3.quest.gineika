package com.example.quest.repository;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Quest;
import com.example.quest.entity.Question;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionRepository {
    private static final QuestionRepository QUESTION_REPO = new QuestionRepository();

    private final List<Question> questionList = new ArrayList(){{
        add(new Question(1l, "Ты потерял память. Принять вызов НЛО?"));
        add(new Question(2l, "Ты принял вызов. Поднимаешься на мостик к капитану?"));
        add(new Question(3l, "Ты поднялся на мостик. Ты кто?"));
    }};

    private QuestionRepository(){};

    public static QuestionRepository getQUESTION_REPO(){
        return QUESTION_REPO;
    }

    public  List<Question> getQuestionsList(){
        return questionList;
    }
}
