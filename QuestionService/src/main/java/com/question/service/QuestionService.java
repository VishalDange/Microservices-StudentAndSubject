package com.question.service;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

//    create
    Question create(Question question);

//    get all
    List<Question> get();

//    get single
    Question getOne(Long id);

//    Find by quizId
    List<Question> getQuestionOfQuiz(Long id);
}
