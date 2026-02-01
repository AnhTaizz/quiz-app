package com.app.quiz_app_demo.controller;

import com.app.quiz_app_demo.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Lưu ý: Dùng @Controller, KHÔNG dùng @RestController
public class HomeController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/")
    public String home(Model model) {
        // Lấy danh sách quiz từ DB
        // Tên "quizzes" này sẽ được dùng trong file HTML
        model.addAttribute("listQuizzes", quizRepository.findAll());

        return "home"; // Trả về file home.html
    }
}