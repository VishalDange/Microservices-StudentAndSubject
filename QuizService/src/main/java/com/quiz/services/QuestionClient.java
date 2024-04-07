package com.quiz.services;

import com.quiz.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url="http://localhost:8082",value="Question-Client")
@Service
@FeignClient(name="QuestionService")
public interface QuestionClient {
    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionOfQuiz(@PathVariable Long id);
}
