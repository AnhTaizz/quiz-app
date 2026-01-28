package com.app.quiz_app_demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AttemptAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attemptAnswersID;

    @ManyToOne
    @JoinColumn(name = "attemptID", nullable = false)
    private QuizAttempt quizAttempt;

    @ManyToOne
    @JoinColumn(name = "questionsID", nullable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name = "answerID", nullable = false)
    private Answer answer;
}
