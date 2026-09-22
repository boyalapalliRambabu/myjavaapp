package com.kr.myjavaapp.streams;

public class EmployeeNew {

	private Long id;
	private String name;
	private double salary;

	public EmployeeNew(Long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeNew [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
