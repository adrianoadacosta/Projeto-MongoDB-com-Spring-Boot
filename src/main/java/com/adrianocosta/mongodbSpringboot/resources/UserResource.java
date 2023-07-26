package com.adrianocosta.mongodbSpringboot.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianocosta.mongodbSpringboot.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User adriano = new User("1", "Adriano Costa", "adriano@gmail.com");
		User larissa = new User("2", "Larissa Ramson Costa", "larissa@gmail.com");
		User marcia = new User("3", "Marcia Ramson", "marcia@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(adriano, larissa, marcia));
		return ResponseEntity.ok().body(list);
	}

}
