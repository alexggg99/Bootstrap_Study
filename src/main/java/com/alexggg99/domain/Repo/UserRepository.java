package com.alexggg99.domain.Repo;

import com.alexggg99.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 27.11.2015.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
