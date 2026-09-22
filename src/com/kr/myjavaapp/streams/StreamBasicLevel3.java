package com.kr.myjavaapp.streams;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamBasicLevel3 {

	public static void main(String[] args) {

//		Q31 — toMap() with duplicate keys
//		This is an important interview problem.
//		When duplicate IDs occur, keep the employee with the higher salary.

		List<EmployeeNew> employees = List.of(new EmployeeNew(1L, "Ravi", 80000), new EmployeeNew(2L, "Anil", 120000),
				new EmployeeNew(1L, "Ramesh", 90000), new EmployeeNew(3L, "Suresh", 150000));

		Map<Long, EmployeeNew> res = employees.stream().collect(Collectors.toMap(EmployeeNew::getId,
				Function.identity(),
				(existing, replacement) -> existing.getSalary() > replacement.getSalary() ? existing : replacement));
		System.out.println(res);
//		Q32 — Join employee names

		String names = employees.stream().map(EmployeeNew::getName).collect(Collectors.joining(","));
		System.out.println(names);

//		Q33 — Collect salary statistics
		DoubleSummaryStatistics salSum = employees.stream()
				.collect(Collectors.summarizingDouble(EmployeeNew::getSalary));

		System.out.println(salSum);
//		Q34 — Group employees by department

		List<Em> em = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000));

		Map<String, List<Em>> gropByDep = em.stream().collect(Collectors.groupingBy(Em::getDepartment));
		System.out.println(gropByDep);

//		Q35 — Count employees in each department

		List<Em> employeesForCount = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000));

		Map<String, Long> empCountByDept = employeesForCount.stream()
				.collect(Collectors.groupingBy(Em::getDepartment, Collectors.counting()));
		System.out.println(empCountByDept);

//		Q36 — Highest salary in each department
//		This is a very important interview question.

		List<Em> employeesForHighSal = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000), new Em(6L, "Vijay", "SALES", 95000));

		Map<String, Optional<Em>> ress = employeesForHighSal.stream().collect(
				Collectors.groupingBy(Em::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Em::getSalary))));
		System.out.println(ress);

//		Q37 — Average salary by department

		List<Em> empl = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000), new Em(6L, "Vijay", "SALES", 95000));
		Map<String, Double> avSal = empl.stream()
				.collect(Collectors.groupingBy(Em::getDepartment, Collectors.averagingDouble(Em::getSalary)));

		System.out.println(avSal);

//		Q38 — Total salary by department
//		Given the same employees:

		List<Em> emplData = List.of(new Em(1L, "Ravi", "IT", 80000), new Em(2L, "Anil", "HR", 90000),
				new Em(3L, "Suresh", "IT", 120000), new Em(4L, "Kiran", "SALES", 70000),
				new Em(5L, "Arun", "HR", 110000), new Em(6L, "Vijay", "SALES", 95000));

		Map<String, Double> ans = emplData.stream()
				.collect(Collectors.groupingBy(Em::getDepartment, Collectors.summingDouble(Em::getSalary)));
		System.out.println(ans);

//		Q39 — Partition employees by salary
//		Now we'll learn partitioningBy(), which is different from groupingBy().

		Map<Boolean, List<Em>> ptrans = emplData.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getSalary() >= 100000));
		System.out.println(ptrans);

//		Q40 — Partition and count
//		Let's make partitioningBy() slightly more advanced.
//		Using the same employees, find how many employees earn at least ₹100,000 and how many earn below ₹100,000.

		Map<Boolean, Long> ptsAndCount = emplData.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getSalary() >= 100000, Collectors.counting()));
		System.out.println(ptsAndCount);
	}

}
