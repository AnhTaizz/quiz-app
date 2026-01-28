package com.app.quiz_app_demo.service;

import com.app.quiz_app_demo.model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByQuizId(Long quizId);
}
