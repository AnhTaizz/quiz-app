package com.app.quiz_app_demo.controller;

import com.app.quiz_app_demo.model.Question;
import com.app.quiz_app_demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // API: Lấy danh sách câu hỏi của 1 đề thi
    // GET: http://localhost:8080/api/questions/quiz/1
    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getByQuiz(@PathVariable Long quizId) {
        return ResponseEntity.ok(questionService.getQuestionsByQuizId(quizId));
    }
}
