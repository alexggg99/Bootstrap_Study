package com.alexggg99.domain.Repo;

import com.alexggg99.domain.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 27.11.2015.
 */
public interface QuestionRepository extends CrudRepository<Question, Integer> {
}
