package com.kr.myjavaapp.arrays.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementILatest {

	public static void main(String[] args) {
		int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
//		Brute force approach
		int res = solution(arr);
		System.out.println(res);

//		batter approach1
		int res1 = solution1(arr);
		System.out.println(res1);

//		batter approach2
		int res2 = solution2(arr);
		System.out.println(res2);

//		optimal approach
		int res3 = solution3(arr);
		System.out.println(res3);

	}

	private static int solution3(int[] arr) {

		int cnt = 0;
		int val = 0;
		for (int data : arr) {
			if (cnt == 0) {
				val = data;
				cnt++;
			} else if (val == data) {
				cnt++;
			} else {
				cnt--;
			}
		}
		cnt = 0;
		for (int value : arr) {
			if (val == value) {
				cnt++;
			}
		}
		if (cnt > arr.length / 2) {
			return val;
		}
		return -1;
	}

	private static int solution2(int[] arr) {
		Map<Integer, Integer> map = new HashMap();
		for (int val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > arr.length / 2) {
				return entry.getKey();
			}

		}

		return -1;
	}

	private static int solution1(int[] arr) {

		int max = arr[0];
		for (int val : arr) {
			max = Math.max(val, max);
		}
		int hash[] = new int[max + 1];
		for (int val : arr) {
			hash[val]++;
		}
		for (int val : arr) {
			if (hash[val] > arr.length / 2) {
				return val;
			}
		}

		return -1;
	}

	private static int solution(int[] arr) {

		for (int val : arr) {
			int cnt = 0;
			for (int currentVal : arr) {
				if (val == currentVal) {
					cnt++;
				}
			}

			if (cnt > arr.length / 2) {
				return val;
			}
		}

		return -1;
	}

}
