package com.app.quiz_app_demo.model;


import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerID")
    private Long answerID;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Builder.Default
    private Boolean isCorrect = false;

    @ManyToOne
    @JoinColumn(name = "questionID", nullable = false)
    private Question question;
}

