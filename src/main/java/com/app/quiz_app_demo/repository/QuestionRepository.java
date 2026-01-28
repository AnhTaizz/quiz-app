package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz_QuizID(Long quizID);
}
