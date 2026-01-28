package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory_CategoryID(Long categoryID);
}
