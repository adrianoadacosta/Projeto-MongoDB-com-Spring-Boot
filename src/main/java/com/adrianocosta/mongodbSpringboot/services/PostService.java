package com.adrianocosta.mongodbSpringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianocosta.mongodbSpringboot.domain.Post;
import com.adrianocosta.mongodbSpringboot.repository.PostRepository;
import com.adrianocosta.mongodbSpringboot.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
