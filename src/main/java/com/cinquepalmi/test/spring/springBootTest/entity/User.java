package com.cinquepalmi.test.spring.springBootTest.entity;

import java.time.LocalDateTime;

public class User {
	
	private Long id;
	
	private String name;
	
	private LocalDateTime birthday;
	
	public User() {
		super();
	}

	public User(Long id, String name, LocalDateTime birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	
}
