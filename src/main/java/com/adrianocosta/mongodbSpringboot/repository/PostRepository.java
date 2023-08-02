package com.adrianocosta.mongodbSpringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianocosta.mongodbSpringboot.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}