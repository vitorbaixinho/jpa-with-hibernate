package com.vbaixinho.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.transaction.annotation.Transactional;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;

	protected Course() {};
	
	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}

	
}
