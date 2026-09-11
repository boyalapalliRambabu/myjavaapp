package com.kr.myjavaapp.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithSum0Latest {

	public static void main(String[] args) {
//		  Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]
//		  Output: 5

		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

//		brute
		int res = solution(arr);
		System.out.println(res);

//		better
		int res1 = solution1(arr);
		System.out.println(res1);

//		optimal
		int res2 = solution2(arr);
		System.out.println(res2);
	}

	private static int solution2(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		int sum = 0;
		int maxLength = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum == 0) {
				maxLength = i + 1;
			} else {
				if (map.containsKey(sum)) {
					maxLength = Math.max(maxLength, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}

		}

		return maxLength;
	}

	private static int solution1(int[] arr) {

		int n = arr.length;
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];

				if (sum == 0) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}
		return maxLength;
	}

	private static int solution(int[] arr) {
		int maxLength = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				if (sum == 0) {
					maxLength = Math.max(maxLength, j - i + 1);
				}

			}
		}
		return maxLength;
	}

}
