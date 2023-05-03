package com.example.quest.repository;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Question;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class AnswerRepository {
    private static final AnswerRepository ANSWER_REPO = new AnswerRepository();

   // private List<Question> questionsList = QuestionRepository.getQUESTION_REPO().getQuestionsList();

    private final List<Answer> answerList = new ArrayList(){{
        add(new Answer("Take up a call", true, null));
        add(new Answer("Reject a call", false, "You rejected a call. DEFEAT"));
        add(new Answer("Get up to the bridge", true, null));
        add(new Answer("Refuse to get up to the bridge", false, "You didn’t negotiate. DEFEAT"));
        add(new Answer("Tell the truth about yourself", true, "You were brought home. VICTORY"));
        add(new Answer("Tell the lie about yourself", false, "Your lies have been exposed. DEFEAT"));
    }};

    private AnswerRepository(){};

    public static AnswerRepository getANSWER_REPO(){
        return ANSWER_REPO;
    }

    public List<Answer> getAnswerList(){
        return answerList;
    }
}
