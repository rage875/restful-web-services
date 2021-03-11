package com.udemy_luis03.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Size;
import javax.validation.constraints.Past;

public class User {
	private Integer id;
	//@Size(min = 2)
	@Size(min = 2, message="Name should have at least two characters")
	private String name;
	//@Past()
	@Past(message="Cannot use a future date")
	private Date birthDate;
	
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
