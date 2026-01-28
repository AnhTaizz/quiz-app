package com.app.quiz_app_demo.controller;

import com.app.quiz_app_demo.model.Answer;
import com.app.quiz_app_demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    // API: Lấy các đáp án của 1 câu hỏi
    // GET: http://localhost:8080/api/answers/question/5
    @GetMapping("/question/{questionId}")
    public ResponseEntity<List<Answer>> getByQuestion(@PathVariable Long questionId) {
        return ResponseEntity.ok(answerService.getAnswersByQuestionId(questionId));
    }
}
