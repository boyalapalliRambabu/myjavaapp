package com.kr.myjavaapp.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 4 };
		int k = 6;
//		brute
		int res = solution(arr, k);
		System.out.println(res);
//      better
		int res1 = solution1(arr, k);
		System.out.println(res1);

//		optimal

		int res2 = solution2(arr, k);
		System.out.println(res2);
	}

	private static int solution2(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		int sum = 0;
		map.put(0, 1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum - k)) {
				cnt += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return cnt;
	}

	private static int solution1(int[] arr, int k) {

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					cnt += 1;
				}
			}
		}
		return cnt;
	}

	private static int solution(int[] arr, int k) {
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				int sum = 0;
				for (int l = i; l <= j; l++) {
					sum += arr[l];
				}

				if (sum == k) {
					cnt++;
				}

			}

		}

		return cnt;
	}

}
