package com.app.quiz_app_demo.service;

import com.app.quiz_app_demo.model.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> getAnswersByQuestionId(Long questionId);
}
