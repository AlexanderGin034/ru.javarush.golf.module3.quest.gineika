package com.example.quest.service;

import com.example.quest.entity.Question;
import com.example.quest.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

//@Getter
public class GameService {

    @Getter
    private int gameCount = 1;

    private static final QuestionRepository questions = QuestionRepository.getQUESTION_REPO();

    public void incrGameCount() {
        gameCount = gameCount == 3? 1: ++gameCount;
    }

    public Optional<Question> getQuestion(long keyQuestion){
        return questions.getQuestion(keyQuestion);
    }



}
