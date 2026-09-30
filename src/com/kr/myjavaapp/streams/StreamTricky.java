package com.kr.myjavaapp.streams;

import java.util.List;
import java.util.Optional;

public class StreamTricky {

	public static void main(String[] args) {
//		Now Q51:
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

		// opt put 4,8

//		Now Q52:
		numbers.stream().filter(n -> {
			System.out.println("filter :" + n);
			return n % 2 == 0;
		}).map(n -> {
			System.out.println("Map :" + n);
			return n * 10;
		}).forEach(System.out::println);

//		Now Q53:
		numbers.stream().filter(n -> {
			System.out.println("filter: " + n);
			return n > 2;
		}).map(n -> {
			System.out.println("map: " + n);
			return n * 10;
		}).findFirst();

//		Q54 — findFirst() vs findAny()

		Optional<Integer> result = numbers.parallelStream().filter(n -> n > 2).findAny();

		System.out.println(result.get());

		numbers.stream().filter(n -> n > 2).limit(2).forEach(System.out::println);

//		Q56 — sorted() + limit() performance thinking
		List<Integer> number = List.of(5, 1, 9, 3, 7, 2);

		number.stream().sorted().limit(3).forEach(System.out::println);

		System.out.println("----------------------------");
		List<Integer> num = List.of(1, 2, 3);

		num.stream().peek(n -> System.out.println("peek: " + n)).map(n -> n * 2);
	}
}
