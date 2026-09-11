package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class LargestElementInArray {
	public static void main(String[] args) {
		int arr[] = { 32, 4, 62, 65, 3, 245, 23, 422, 42 };
//        bruteforce
//		int res = solution(arr);
//		System.out.println(res);
//		optimal
		int res1 = solution1(arr);
		System.out.println(res1);
	}

	private static int solution1(int[] arr) {
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > large) {
				large = arr[i];
			}
		}
		return large;
	}

	private static int solution(int[] arr) {

		if (arr == null || arr.length == 0) {
			return -1;
		}
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

}
