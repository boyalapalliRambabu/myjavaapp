package com.kr.myjavaapp.streams;

class Employee {
	private String name;
	private String dept;
	private int sal;

	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
}
