package com.kr.myjavaapp.arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindTheNumberThatAppearsOnceAndOtherNumbersTwice {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4, 3, 1, 4 };
//      bruteforce
		int res = solution(arr);
		System.out.println(res);
//      better
		int res1 = solution1(arr);
		System.out.println(res1);
//      optimal
		int res2 = solution2(arr);
		System.out.println(res2);

//		optimal2
		int res3 = solution3(arr);
		System.out.println(res3);

	}

	private static int solution3(int[] arr) {
		int xor = 0;
		for (int val : arr) {
			xor ^= val;
		}
		return xor;
	}

	private static int solution2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> ent : map.entrySet()) {
			if (ent.getValue() == 1) {
				return ent.getKey();
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

		for (int i = 0; i < arr.length; i++) {
			if (hash[arr[i]] == 1) {
				return arr[i];
			}
		}

		return -1;
	}

	private static int solution(int[] arr) {
		for (int val : arr) {
			int cnt = 0;
			for (int check : arr) {
				if (val == check) {
					cnt++;
				}
			}
			if (cnt == 1) {
				return val;
			}
		}
		return -1;
	}

}
