package com.app.quiz_app_demo.model;

import com.app.quiz_app_demo.enums.QuestionType;
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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionID;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(length = 500)
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private QuestionType questionType;

    @ManyToOne
    @JoinColumn(name = "quizID", nullable = false)
    private Quiz quiz;

}
