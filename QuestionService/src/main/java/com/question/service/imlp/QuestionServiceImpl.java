package com.question.service.imlp;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question create(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return this.questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return this.questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not Found"));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long id) {
        return this.questionRepository.findByQuizId(id);
    }
}
