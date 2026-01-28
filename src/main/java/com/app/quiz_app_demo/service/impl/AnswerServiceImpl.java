package com.app.quiz_app_demo.service.impl;

import com.app.quiz_app_demo.model.Answer;
import com.app.quiz_app_demo.repository.AnswerRepository;
import com.app.quiz_app_demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerRepository.findByQuestion_QuestionID(questionId);
    }
}
