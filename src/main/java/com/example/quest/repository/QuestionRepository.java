package com.example.quest.repository;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Question;

import java.util.*;

public class QuestionRepository {
    private static final QuestionRepository QUESTION_REPO = new QuestionRepository();
    private final List<Answer> answers = AnswerRepository.getANSWER_REPO().getAnswerList();
    private final List<Question> questionList = new ArrayList() {{
        add(new Question(1l, "You've lost your memory. Accept the UFO challenge?", new ArrayList<>(Arrays.asList(answers.get(0), answers.get(1))), null, 2l));
        add(new Question(2l, "You took the call. Going up to the bridge to the captain?", new ArrayList<>(Arrays.asList(answers.get(2), answers.get(3))), 1l, 3l));
        add(new Question(3l, "You went up to the bridge. Who are you?", new ArrayList<>(Arrays.asList(answers.get(4), answers.get(5))), 2l, null));
    }};

    private QuestionRepository() {
    }

    public static QuestionRepository getQUESTION_REPO() {
        return QUESTION_REPO;
    }

    public List<Question> getQuestionsList() {
        return questionList;
    }

    public Optional<Question> getQuestion(long keyQuestion) {
        return questionList.stream()
                .filter(q -> q.getId() == keyQuestion)
                .findFirst();
    }
}
