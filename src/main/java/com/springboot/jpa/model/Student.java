package com.springboot.jpa.model;

public class Student {
	
	int id;
	
	String name;
	
	double testScore;
	
	
	public Student(int id, String name, double testScore) {
		super();
		this.id = id;
		this.name = name;
		this.testScore = testScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTestScore() {
		return testScore;
	}

	public void setTestScore(double testScore) {
		this.testScore = testScore;
	}

}
