package com.kr.myjavaapp.streams;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		List<String> names = List.of("ram", "shyam", "krishna");

		List<String> result = names.stream().filter(n -> n.length() > 4).map(n -> n.toUpperCase()).toList();
		System.out.println(result);
	}
}
