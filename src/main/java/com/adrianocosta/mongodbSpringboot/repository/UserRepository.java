package com.adrianocosta.mongodbSpringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianocosta.mongodbSpringboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
