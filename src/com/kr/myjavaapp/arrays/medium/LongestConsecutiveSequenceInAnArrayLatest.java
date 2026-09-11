package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArrayLatest {

	public static void main(String[] args) {

		int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		bruet
		int res = solution(arr);
		System.out.println(res);

//		better
//		int res1 = solution1(arr);
//		System.out.println(res1);

//		optimal
		int res2 = solution2(arr);
		System.out.println(res2);

	}

	private static int solution2(int[] arr) {
		int largest = 0;

		Set<Integer> set = new HashSet<>();

		for (int val : arr) {
			set.add(val);
		}

		for (int val : arr) {

			if (!set.contains(val - 1)) {
				int cnt = 1;
				int x = val;
				while (set.contains(x + 1)) {
					x += 1;
					cnt += 1;
				}
				largest = Math.max(cnt, largest);
			}

		}

		return largest;
	}

	private static int solution1(int[] arr) {

		int largest = 0, cnt = 1, lastSenMin = Integer.MIN_VALUE;
		Arrays.sort(arr);

		for (int val : arr) {

			if (val - 1 == lastSenMin) {
				cnt += 1;
				lastSenMin = val;
			} else if (val != lastSenMin) {
				cnt = 1;
				lastSenMin = val;
			}
			largest = Math.max(cnt, largest);
		}

		return largest;
	}

	private static int solution(int[] arr) {
		int larget = 0;
		for (int val : arr) {
			int cnt = 1;
			int cv = val;

			while (linear(arr, cv + 1)) {
				cnt += 1;
				cv += 1;
			}

			larget = Math.max(cnt, larget);
		}
		return larget;
	}

	private static boolean linear(int[] arr, int target) {
		for (int val : arr) {
			if (val == target) {
				return true;
			}
		}
		return false;
	}

}
