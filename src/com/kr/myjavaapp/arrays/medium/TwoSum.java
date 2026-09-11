package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
//		Input: nums = [1, 6, 2, 10, 3], target = 7
//		Output: [0, 1]	

		int arr[] = { 1, 6, 2, 10, 3 };
		int target = 7;
//		int[] res = solution(arr, target);
//		System.out.println(Arrays.toString(res));
		int[] res = solution1(arr, target);
		System.out.println(Arrays.toString(res));

	}

	private static int[] solution1(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int val = target - arr[i];

			if (map.containsKey(val)) {
				return new int[] { map.get(val), i };
			}

			map.put(arr[i], i);
		}
		return new int[] { -1, -1 };
	}

	// brute force approach
	private static int[] solution(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}
