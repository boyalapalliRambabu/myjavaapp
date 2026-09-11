package com.kr.myjavaapp.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Ram", "IT", 5000), new Employee("Shyam", "HR", 322),
				new Employee("Krishna", "IT", 4322), new Employee("Arjun", "Finance", 4334),
				new Employee("Ravi", "HR", 8328));

//		Map<String, Long> res = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//		System.out.println(res);
		Map<String, Integer> res = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.summingInt(Employee::getSal)));
		System.out.println(res);
	}
}
