package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestion_QuestionID(Long questionID);
}
