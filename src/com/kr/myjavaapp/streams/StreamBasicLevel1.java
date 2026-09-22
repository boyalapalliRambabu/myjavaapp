package com.kr.myjavaapp.streams;

import java.util.Arrays;
import java.util.List;

public class StreamBasicLevel1 {
	public static void main(String[] args) {

//		Question 11 — Find Names Starting With "R"
		List<String> names = List.of("Ravi", "Ram", "Anil", "Ramesh", "Suresh", "Raj");

		List<String> nameStarwithR = names.stream().filter(name -> name.startsWith("R")).toList();
		System.out.println(nameStarwithR);

//		Question 12 — Names longer than 5 characters

		List<String> namesLongerThan5 = names.stream().filter(name -> name.length() > 5).toList();
		System.out.println(namesLongerThan5);

//		Question 13 — Convert Employee objects to names
		List<Emp> employees = List.of(new Emp("Ravi", 80000), new Emp("Anil", 90000), new Emp("Suresh", 120000));

		List<String> emplsNames = employees.stream().map(Emp::getName).toList();
		System.out.println(emplsNames);

//		Question 14 — flatMap()

		List<List<Integer>> numbers = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8));

		List<Integer> flat = numbers.stream().flatMap(list -> list.stream()).toList();

		System.out.println(flat);

//		Question 15 — Unique words from sentences
		List<String> sentences = List.of("Java is powerful", "Java is popular", "Spring Boot is powerful");

		List<String> disNames = sentences.stream().flatMap(str -> Arrays.stream(str.split(" "))).distinct().toList();
		System.out.println(disNames);

		List<Emp> emps = List.of(new Emp("Ravi", 80000), new Emp("Anil", 150000), new Emp("Suresh", 120000),
				new Emp("Kiran", 70000));
//		Question 16 — Filter employees by salary
//		Find all employees whose salary is greater than ₹100,000.
		List<Emp> empSal = emps.stream().filter(emp -> emp.getSalary() > 100000).toList();
		System.out.println(empSal.toString());

//		Question 17 — Employee → EmployeeDTO
//		Now we'll combine map() + objects, which is a very common Spring Boot scenario.

		List<EmployeeNew> employeesNew = List.of(new EmployeeNew(1L, "Ravi", 80000),
				new EmployeeNew(2L, "Anil", 120000), new EmployeeNew(3L, "Suresh", 150000));

		List<EmployeeDTO> empDto = employeesNew.stream().map(emp -> new EmployeeDTO(emp.getId(), emp.getName()))
				.toList();

		System.out.println(empDto);

//		Question 18 — flatMap() + objects
//		Now let's make it more realistic.
		List<EmployeeP> employeesP = List.of(new EmployeeP("Ravi", List.of("Banking", "Kafka")),
				new EmployeeP("Anil", List.of("Redis", "Spring Boot")),
				new EmployeeP("Suresh", List.of("Kafka", "Docker")));

		List<String> disPro = employeesP.stream().flatMap(emp -> emp.getProjects().stream()).distinct().toList();
		System.out.println(disPro);

//		Question 19 — anyMatch()
		List<Emp> empl = List.of(new Emp("Ravi", 80000), new Emp("Anil", 150000), new Emp("Suresh", 120000),
				new Emp("Kiran", 70000));

		boolean salStatus = empl.stream().anyMatch(emp -> emp.getSalary() > 200000);
		boolean allHighSalary = employees.stream().allMatch(emp -> emp.getSalary() > 50000);

		boolean noLowSalary = employees.stream().noneMatch(emp -> emp.getSalary() < 50000);
		System.out.println(salStatus);

//		Question 20 — Check whether all employees earn more than ₹50,000

		List<Emp> emplo = List.of(new Emp("Ravi", 80000), new Emp("Anil", 150000), new Emp("Suresh", 120000),
				new Emp("Kiran", 70000));

		boolean salStas = emplo.stream().allMatch(emp -> emp.getSalary() > 50000);
		System.out.println(salStas);
	}

}
