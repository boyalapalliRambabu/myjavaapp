package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

	public static void main(String[] args) {
//	Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.
//	Example 1 Input: nums = [1, 2, 1, 1, 3, 2]
//	Output: [1]
//	Explanation:
//	Here, n / 3 = 6 / 3 = 2.
//	Therefore the elements appearing 3 or more times is : [1]
//	Example 2
//	Input: nums = [1, 2, 1, 1, 3, 2, 2]
//	Output: [1, 2]
//	Explanation:
//	Here, n / 3 = 7 / 3 = 2.
//	Therefore the elements appearing 3 or more times is : [1, 2]
//	Now your turn!
//	Input: nums = [1, 2, 1, 1, 3, 2, 2, 3](Give the solution sorted in ascending order)
//		bruteForce
		int arr[] = { 1, 2, 1, 1, 3, 2, 2 };
		List<Integer> res = solution(arr);
		System.out.println(res);

//		batter
		List<Integer> res1 = solution1(arr);
		System.out.println(res1);
//		optimal
		List<Integer> res2 = solution2(arr);
		System.out.println(res2);
	}

	private static List<Integer> solution2(int[] arr) {

		List<Integer> list = new ArrayList<>();

		int cont1 = 0, cont2 = 0;
		int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (cont1 == 0 && el2 != arr[i]) {
				cont1 = 1;
				el1 = arr[i];
			} else if (cont2 == 0 && el1 != arr[i]) {
				cont2 = 1;
				el2 = arr[i];
			} else if (arr[i] == el1) {
				cont1++;
			} else if (arr[i] == el2) {
				cont2++;
			} else {
				cont1--;
				cont2--;
			}

		}
		cont1 = 0;
		cont2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == el1) {
				cont1++;
			}
			if (arr[i] == el2) {
				cont2++;
			}
		}
		int min = arr.length / 3 + 1;

		if (cont1 >= min) {
			list.add(el1);
		}
		if (cont2 >= min && el1 != el2) {
			list.add(el2);
		}

		return list;
	}

	private static List<Integer> solution1(int[] arr) {

		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();
		int min = (arr.length / 3) + 1;

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if (map.get(arr[i]) == min) {
				list.add(arr[i]);
			}
			if (list.size() == 2) {
				break;
			}
		}
		return list;
	}

	private static List<Integer> solution(int[] arr) {

		List<Integer> list = new ArrayList<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (list.isEmpty() || list.get(0) != arr[i] && (list.size() < 2 || list.get(1) != arr[i])) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				if (count > n / 3) {
					list.add(arr[i]);
				}
			}
			if (list.size() == 2) {
				break;
			}
		}

		return list;
	}
}
