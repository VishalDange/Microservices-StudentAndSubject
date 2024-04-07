package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

//    create

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
          return quizService.add(quiz);
    }

//    getAll

    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

//    get one
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return this.quizService.getOne(id);
    }
}
