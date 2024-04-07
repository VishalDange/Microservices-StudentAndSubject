package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Long questionId;
    private String question;
    private Long quizId;
}
