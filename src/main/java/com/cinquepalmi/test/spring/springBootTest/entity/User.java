package com.cinquepalmi.test.spring.springBootTest.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the user")
public class User {
	
	private Long id;
	
	@ApiModelProperty(notes="Name connot be empty")
	@NotEmpty(message="Name must not be null")
	private String name;
	
	@ApiModelProperty(notes="Birthday should be in the past")
	@Past(message="Birthday must be a past date")
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
