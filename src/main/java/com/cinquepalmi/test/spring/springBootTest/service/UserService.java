package com.cinquepalmi.test.spring.springBootTest.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.cinquepalmi.test.spring.springBootTest.entity.User;

@Component
public class UserService {

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1L, "Pino Cane", LocalDateTime.now()));
		users.add(new User(2L, "Pino Gatto", LocalDateTime.now()));
		users.add(new User(3L, "Tina Cane", LocalDateTime.now()));
	}
	
	public List<User> getAll(){
		return users;
	}
	
	public Optional<User> getById(Long id){
		return users.stream().filter(u -> u.getId().equals(id)).findFirst();
	}
	
	public User save(User user) {
		Long id = 1L;
		Optional<User> max = users.stream().max(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		if(max.isPresent()) {
			id = max.get().getId() + 1;
		}
		user.setId(id);
		users.add(user);
		return user;
	}
}
