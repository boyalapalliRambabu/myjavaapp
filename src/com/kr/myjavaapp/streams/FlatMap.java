package com.kr.myjavaapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> list = List.of(List.of(1, 2), List.of(3, 4));

		List<Integer> res = list.stream().flatMap(n -> n.stream()).toList();
		System.out.println(res);
		List<String> sentences = List.of("hello world", "java streams");

		List<String> ls = sentences.stream().flatMap(n -> Arrays.stream(n.split(" "))).toList();
		System.out.println(ls);
		List<String> names = List.of("ram", "shyam", "krishna");

		Map<Integer, List<String>> ls1 = names.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(ls1);
	}

}
