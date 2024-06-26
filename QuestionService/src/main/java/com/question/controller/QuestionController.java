package com.question.controller;

import com.question.entities.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question){
        return this.questionService.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestion(){
        return this.questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne( @PathVariable Long id){
        return this.questionService.getOne(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfList(@PathVariable Long quizId){
        return this.questionService.getQuestionOfQuiz(quizId);
    }
}
