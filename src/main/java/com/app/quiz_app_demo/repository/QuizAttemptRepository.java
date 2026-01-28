package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.QuizAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizAttemptRepository extends JpaRepository<QuizAttempt, Long> {
    List<QuizAttempt> findByUser_UserID(Long userID);
    List<QuizAttempt> findByQuiz_QuizID(Long quizID);
}
