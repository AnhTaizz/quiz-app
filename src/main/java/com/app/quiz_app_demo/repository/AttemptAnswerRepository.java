package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.AttemptAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttemptAnswerRepository extends JpaRepository<AttemptAnswer, Long> {
    List<AttemptAnswer> findByQuizAttempt_AttemptID(Long attemptID);
}
