package com.app.quiz_app_demo.service.impl;

import com.app.quiz_app_demo.model.Question;
import com.app.quiz_app_demo.repository.QuestionRepository;
import com.app.quiz_app_demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepository.findByQuiz_QuizID(quizId);
    }
}