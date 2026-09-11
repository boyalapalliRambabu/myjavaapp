package com.kr.myjavaapp.streams;

import java.util.Arrays;
import java.util.List;

public class SumByStreams {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		int sum1 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum1);
	}
}
