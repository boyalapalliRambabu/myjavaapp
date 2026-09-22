package com.kr.myjavaapp.streams;

import java.util.List;

public class EmployeeP {
	private String name;
	private List<String> projects;

	public EmployeeP(String name, List<String> projects) {
		super();
		this.name = name;
		this.projects = projects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "EmployeeP [name=" + name + ", projects=" + projects + "]";
	}

}
