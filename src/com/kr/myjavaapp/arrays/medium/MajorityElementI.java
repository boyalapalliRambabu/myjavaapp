package com.kr.myjavaapp.arrays.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementI {

	public static void main(String[] args) {

//		        Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
//				Output: 7
//				Explanation:
//				The number 7 appears 5 times in the 9 sized array

		int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
//		Brute force approach
		int res = solution(arr);
		System.out.println(res);
//		Brute force approach
		int res1 = solution1(arr);
		System.out.println(res1);
//		better
		int res2 = solution2(arr);
		System.out.println(res2);

		int res3 = solution3(arr);
		System.out.println(res3);
	}

	private static int solution3(int[] arr) {

		int n = arr.length;

		int count = 0;
		int el = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				count = 1;
				el = arr[i];
			} else if (arr[i] == el) {
				count++;
			} else {
				count--;
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == el) {
				cnt++;
			}
		}

		if (cnt > n / 2) {
			return el;
		}

		return -1;
	}

	private static int solution2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> val : map.entrySet()) {
			if (val.getValue() > arr.length / 2) {
				return val.getKey();
			}

		}

		return 0;
	}

	private static int solution1(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				return arr[i];
			}
		}

		return -1;
	}

	private static int solution(int[] arr) {
		int max = arr[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int seen[] = new int[max + 1];
		for (int i = 0; i < n; i++) {
			seen[arr[i]]++;
		}

		for (int i = 0; i < seen.length; i++) {
			if (seen[i] > n / 2) {
				return i;
			}
		}
		return -1;
	}

}
