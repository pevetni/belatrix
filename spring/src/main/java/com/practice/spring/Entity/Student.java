package com.practice.spring.Entity;

public class Student {
	private long id;
	private String name;
	private String curse;
	
	public Student(long id, String name, String curse) {
		super();
		this.id = id;
		this.name = name;
		this.curse = curse;
	}
	
	public Student(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurse() {
		return curse;
	}

	public void setCurse(String curse) {
		this.curse = curse;
	}
	
	
	
}
