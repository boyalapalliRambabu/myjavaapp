package com.kr.myjavaapp.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamBasic {

	public static void main(String[] args) {

//    find even number
		List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);

		List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).toList();
		System.out.println(even);

//		Question 2 — Find numbers greater than 20

		List<Integer> grateThan20 = numbers.stream().filter(n -> n > 20).toList();
		System.out.println(grateThan20);

//		Question 3 — Convert Strings to Uppercase
 
		List<String> names = List.of("ravi", "ram", "anil", "suresh");

		List<String> nameList = names.stream().map(String::toUpperCase).toList();
		System.out.println(nameList);

//		Question 4 — Count the number of elements

		long count = numbers.stream().count();
		System.out.println(count);

//		Question 5 — Find the Maximum Number

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//		or 
		int maxVal = numbers.stream().max((a, b) -> Integer.compare(a, b)).orElseThrow();
		int maxs = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
		System.out.println(max.get());
		System.out.println(maxVal);
		System.out.println(maxs);

//		Next: Question 6 — Find the minimum number.

		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		int minVal = numbers.stream().min(Integer::compareTo).orElseThrow();

		int mins = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow();
		System.out.println(min.get());
		System.out.println(minVal);
		System.out.println(mins);
//		Small challenge
//		Find the minimum even number:

		int minEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).min().orElseThrow();
		System.out.println(minEven);

//		Question 7 — Sum of all numbers

		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		double averagel = numbers.stream().mapToInt(Integer::intValue).average().orElseThrow();
		System.out.println(average.getAsDouble());
		System.out.println(averagel);
		List<Integer> number = List.of(10, 20, 10, 30, 20, 40, 30, 50);

		List<Integer> district = number.stream().distinct().toList();
		System.out.println(district);
		List<Integer> numbersls = List.of(40, 10, 30, 20, 50);

		List<Integer> lsAs = numbersls.stream().sorted((a, b) -> Integer.compare(a, b)).toList();
		System.out.println(lsAs);
		List<Integer> lsAs1 = numbersls.stream().sorted().toList();
		System.out.println(lsAs1);
		List<Integer> lsDs = numbersls.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(lsDs);
	}

}
