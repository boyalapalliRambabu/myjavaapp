package com.kr.myjavaapp.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> res = new ArrayList<>();

		for (int ls : list) {
			if (ls % 2 == 0) {
				res.add(ls * 2);
			}
		}
		System.out.println(res);

		List<Integer> result = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();

		System.out.println(result);

//		Get squares of odd numbers
//		Input: [1,2,3,4,5]
//		Output: [1,9,25]
		List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> sq=lists.stream().filter(n -> n%2==1).map(n -> n*n).toList();
		System.out.println(sq);
	}
}
