package com.cinquepalmi.test.spring.springBootTest.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cinquepalmi.test.spring.springBootTest.entity.User;
import com.cinquepalmi.test.spring.springBootTest.exception.UserNotFoundException;
import com.cinquepalmi.test.spring.springBootTest.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(path="/users")
	public List<User> getAll(){
		return service.getAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User get(@PathVariable Long id){
		Optional<User> o = service.getById(id);
		if(!o.isPresent()) {
			throw new UserNotFoundException("id-"+id);
		}		
		return o.get();
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> save(@Valid @RequestBody User user) {
		User u = service.save(user);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}").buildAndExpand(u.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
}
