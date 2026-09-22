package com.kr.myjavaapp.streams;

import java.util.List;

public class Empl {
	private Long id;
	private String name;
	private String department;
	private String gender;
	private double salary;
	private int age;
	private List<String> projects;

	public Empl(Long id, String name, String department, String gender, double salary, int age, List<String> projects) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
		this.projects = projects;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public List<String> getProjects() {
		return projects;
	}

	@Override
	public String toString() {
		return name + " (" + salary + ")";
	}
}
