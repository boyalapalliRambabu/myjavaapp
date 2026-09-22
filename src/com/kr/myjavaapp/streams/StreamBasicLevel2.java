package com.kr.myjavaapp.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamBasicLevel2 {
	public static void main(String[] args) {

//		Q21 — Find the first employee with salary > ₹100,000

		List<Emp> employees = List.of(new Emp("Ravi", 80000), new Emp("Anil", 150000), new Emp("Suresh", 120000),
				new Emp("Kiran", 70000));

		Emp emp = employees.stream().filter(n -> n.getSalary() > 100000).findFirst().orElseThrow();
		System.out.println(emp);
//		Q22 — Get the first 3 highest-paid employees

		List<Emp> employeesSal = List.of(new Emp("Ravi", 80000), new Emp("Anil", 150000), new Emp("Suresh", 120000),
				new Emp("Kiran", 70000), new Emp("Arun", 200000), new Emp("Vijay", 110000));

		List<Emp> highSal = employeesSal.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).limit(3)
				.toList();
		System.out.println(highSal);

//		Q23 — Find the top 3 salaries, not employees

		List<Double> toSal = employeesSal.stream().map(Emp::getSalary).sorted(Comparator.reverseOrder()).limit(3)
				.toList();

		System.out.println(toSal);

//		Q24 — Find the sum using reduce()

		double sumSal = employeesSal.stream().map(Emp::getSalary).reduce(0.0, Double::sum);
		System.out.println(sumSal);

//		Q25 — Find the maximum using reduce()
//		Now let's use reduce() for something where the general-purpose nature is more obvious.

		List<Integer> numbers = List.of(10, 25, 5, 40, 30);

		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		int max1 = numbers.stream().reduce(0, Integer::max);
		int max2 = numbers.stream().reduce(Integer::max).orElseThrow();

		System.out.println(max.get());
		System.out.println(max1);

//		Q26 — Find the product of all numbers using reduce()

		List<Integer> numbersP = List.of(2, 3, 4, 5);
		Optional<Integer> product = numbersP.stream().reduce((a, b) -> a * b);
		System.out.println(product.get());

//		Q27 — Find the longest String using reduce()
		List<String> names = List.of("Ravi", "Alexander", "Ram", "Suresh");
		Optional<String> name = names.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
		System.out.println(name.get());
//     	Q28 ✅
//		Now we're ready for the most important part of Streams interviews: Collectors.
//      Q29 — Collect employee names into a Set

		List<Emp> employeesList = List.of(new Emp("Ravi", 80000), new Emp("Anil", 120000), new Emp("Ravi", 90000),
				new Emp("Suresh", 150000));

		Set<String> nameList = employeesList.stream().map(Emp::getName).collect(Collectors.toSet());
		System.out.println(nameList);

//		Q30 — Convert employees into a Map

		List<EmployeeNew> employeesMap = List.of(new EmployeeNew(1L, "Ravi", 80000),
				new EmployeeNew(2L, "Anil", 120000), new EmployeeNew(3L, "Suresh", 150000));

		Map<Long, EmployeeNew> res = employeesMap.stream()
				.collect(Collectors.toMap(EmployeeNew::getId, Function.identity()));

		Map<Long, EmployeeNew> res1 = employeesMap.stream()
				.collect(Collectors.toMap(EmployeeNew::getId, EmployeeNew -> EmployeeNew));
		System.out.println(res);
		System.out.println(res1);
	}
}
