package com.kr.myjavaapp.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasicLevel5 {
	public static void main(String[] args) {
//		Now let's do Part 2 — highest salary in each department.

		List<Empl> employees = List.of(new Empl(1L, "Ravi", "IT", "MALE", 80000, 28, List.of("Banking", "Kafka")),

				new Empl(2L, "Anil", "IT", "MALE", 150000, 35, List.of("Redis", "Spring")),

				new Empl(3L, "Sita", "HR", "FEMALE", 110000, 32, List.of("Recruitment")),

				new Empl(4L, "Arun", "HR", "MALE", 90000, 29, List.of("Payroll", "Compliance")),

				new Empl(5L, "Priya", "IT", "FEMALE", 130000, 31, List.of("Kafka", "Docker")),

				new Empl(6L, "Kiran", "SALES", "MALE", 70000, 26, List.of("CRM")));

		Map<String, Optional<Empl>> res1 = employees.stream().collect(Collectors.groupingBy(Empl::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Empl::getSalary))));
		System.out.println(res1);

//		Q50 — Part 3: Average salary by department

		Map<String, Double> res2 = employees.stream()
				.collect(Collectors.groupingBy(Empl::getDepartment, Collectors.averagingDouble(Empl::getSalary)));
		System.out.println(res2);
//		
//		Q50 Part 4 — Male/Female count by department
//		Now we introduce nested groupingBy().

		Map<String, Map<String, Long>> res3 = employees.stream().collect(Collectors.groupingBy(Empl::getDepartment,
				Collectors.groupingBy(Empl::getGender, Collectors.counting())));
		System.out.println(res3);
//		Q50 Part 5 — Employees with salary > ₹100,000
		List<Empl> res4 = employees.stream().filter(emp -> emp.getSalary() > 100000).toList();
		System.out.println(res4);

//		Q50 Part 6 — Top 3 highest-paid employees
		List<Empl> res5 = employees.stream().sorted(Comparator.comparingDouble(Empl::getSalary).reversed()).limit(3)
				.toList();
		System.out.println(res5);

//		Q50 Part 7 — Departments with average salary > ₹100,000

		Map<Object, Object> res6 = employees.stream()
				.collect(Collectors.groupingBy(Empl::getDepartment, Collectors.averagingDouble(Empl::getSalary)))
				.entrySet().stream().filter(emp -> emp.getValue() > 100000)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(res6);
	}

}
