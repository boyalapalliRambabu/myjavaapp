package com.kr.myjavaapp.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasicLevel4 {

	public static void main(String[] args) {
//		Q41 — Group employees by department and collect only their names
		List<Em> employees = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000));

		Map<String, List<String>> res = employees.stream().collect(
				Collectors.groupingBy(Em::getDepartment, Collectors.mapping(Em::getName, Collectors.toList())));
		System.out.println(res);

		List<Em> employee1 = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Ravi", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Anil", "HR", 110000));

		Map<String, Set<String>> unique = employee1.stream()
				.collect(Collectors.groupingBy(Em::getDepartment, Collectors.mapping(Em::getName, Collectors.toSet())));

		System.out.println(unique);

//		Q43 — Find duplicate elements
//		Now we're moving into a classic interview problem.

		List<Integer> numbers = List.of(10, 20, 10, 30, 40, 20, 50, 30);
		List<Integer> ans = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).toList();
		System.out.println(ans);

		List<String> names = List.of("Ravi", "Anil", "Ravi", "Suresh", "Anil", "Ravi");

		Map<String, Long> ress = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(ress);

//		Q45 — Find the most frequently occurring element

		List<String> namesList = List.of("Ravi", "Anil", "Ravi", "Suresh", "Anil", "Ravi", "Anil");

		String result = namesList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();

		System.out.println(result);

//		Q46 — Second-highest salary
//		This is one of the most common Java Stream interview questions.

		List<EmployeeNew> employeesSal = List.of(new EmployeeNew(1L, "Ravi", 80000),
				new EmployeeNew(2L, "Anil", 150000), new EmployeeNew(3L, "Suresh", 120000),
				new EmployeeNew(4L, "Kiran", 70000), new EmployeeNew(5L, "Arun", 200000));

		Optional<Double> secondSal = employeesSal.stream().map(EmployeeNew::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondSal.get());

//		Q47 — Highest-paid employee in each department
//		This is a very common senior-level question and combines several concepts you've already learned.

		List<Em> employ = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000), new Em(6L, "Vijay", "SALES", 95000));

		Map<String, Optional<Em>> departWithSal = employ.stream().collect(
				Collectors.groupingBy(Em::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Em::getSalary))));

		System.out.println(departWithSal);

//		You have now completed 47/50.
//		Q48 — First non-repeated character
		String input = "swiss";

		Optional<Character> resss = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();

		System.out.println(resss);

//		Q49 — Employees with more than one project

		List<EmployeeP> employeesP = List.of(new EmployeeP("Ravi", List.of("Banking", "Kafka")),
				new EmployeeP("Anil", List.of("Redis", "Spring Boot")),
				new EmployeeP("Suresh", List.of("Kafka", "Docker")));

		List<EmployeeP> ss = employeesP.stream().filter(emp -> emp.getProjects().size() > 1).toList();

		System.out.println(ss);

//		Q50 — Employee count by department

		List<Empl> empl = List.of(new Empl(1L, "Ravi", "IT", "MALE", 80000, 28, List.of("Banking", "Kafka")),

				new Empl(2L, "Anil", "IT", "MALE", 150000, 35, List.of("Redis", "Spring")),

				new Empl(3L, "Sita", "HR", "FEMALE", 110000, 32, List.of("Recruitment")),

				new Empl(4L, "Arun", "HR", "MALE", 90000, 29, List.of("Payroll", "Compliance")),

				new Empl(5L, "Priya", "IT", "FEMALE", 130000, 31, List.of("Kafka", "Docker")),

				new Empl(6L, "Kiran", "SALES", "MALE", 70000, 26, List.of("CRM")));

		Map<String, Long> resa = empl.stream()
				.collect(Collectors.groupingBy(Empl::getDepartment, Collectors.counting()));
		System.out.println(resa);
	}

}