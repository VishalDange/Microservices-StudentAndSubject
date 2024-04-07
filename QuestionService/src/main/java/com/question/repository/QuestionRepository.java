package com.question.repository;

import com.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {

//    @Query("select * from question q where q.quizId=:id")
    List<Question> findByQuizId(Long id);
}
