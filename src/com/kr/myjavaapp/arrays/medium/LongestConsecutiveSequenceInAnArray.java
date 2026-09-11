package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class LongestConsecutiveSequenceInAnArray {
	public static void main(String[] args) {
//		Input: nums = [100, 4, 200, 1, 3, 2]
//		Output: 4

//		int arr[] = { 100, 4, 200, 1, 3, 2 };
//		int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int res = solution(arr);
		System.out.println(res);

		int res1 = solution1(arr);
		System.out.println(res1);
	}

	private static int solution1(int[] arr) {
		Arrays.sort(arr);
		int longest = 1;
		int smallVal = Integer.MIN_VALUE;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - 1 == smallVal) {
				cnt += 1;
				smallVal = arr[i];
			} else if (arr[i] != smallVal) {
				cnt = 1;
				smallVal = arr[i];
			}
			longest = Math.max(longest, cnt);
		}
		return longest;
	}

	private static int solution(int[] arr) {

//		let assum at least one element is there

		int longest = 1;

		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int cnt = 1;

			while (linearSearch(arr, x + 1)) {
				x += 1;
				cnt += 1;
			}

			if (cnt > longest) {
				longest = cnt;
			}
		}
		return longest;
	}

	private static boolean linearSearch(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return true;
			}
		}
		return false;
	}
}
