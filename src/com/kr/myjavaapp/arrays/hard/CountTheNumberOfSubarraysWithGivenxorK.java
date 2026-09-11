package com.kr.myjavaapp.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfSubarraysWithGivenxorK {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 2, 6, 4 };
		int k = 6;
//		brute
		int res = solution(arr, k);
		System.out.println(res);

//		better
		int res1 = solution1(arr, k);
		System.out.println(res1);

//		optimal
		int res2 = solution2(arr, k);
		System.out.println(res2);
	}

	private static int solution2(int[] arr, int k) {
		int cnt = 0;
		int xor = 0;

		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);
		for (int val : arr) {
			xor ^= val;
			int target = xor ^ k;
			if (map.containsKey(target)) {
				cnt += map.get(target);
			}
			map.put(xor, map.getOrDefault(xor, 0) + 1);
		}
		return cnt;
	}

	private static int solution1(int[] arr, int target) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int xor = 0;
			for (int j = i; j < arr.length; j++) {
				xor ^= arr[j];
				if (xor == target) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	private static int solution(int[] arr, int target) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int xor = 0;
				for (int k = i; k <= j; k++) {
					xor ^= arr[k];
				}
				if (xor == target) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
