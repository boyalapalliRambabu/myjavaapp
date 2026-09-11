package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class SecondLargestElementINArray {

	public static void main(String[] args) {
		int arr[] = { 32, 4, 62, 65, 3, 245, 23, 422, 42 };

//		bruteforce
//		int res = solution(arr);
//		System.out.println(res);
//		better
//		int res1 = solution1(arr);
//		System.out.println(res1);
//		optimal
		int res2 = solution2(arr);
		System.out.println(res2);

	}

	private static int solution2(int[] arr) {

		int large = arr[0], sLarge = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > large) {
				sLarge = large;
				large = arr[i];
			} else if (arr[i] > sLarge && arr[i] < large) {
				sLarge = arr[i];
			}
		}

		return sLarge;
	}

	private static int solution1(int[] arr) {
		if (arr == null || arr.length < 1) {
			return -1;
		}
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		int sLarge = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > sLarge && arr[i] != largest) {
				sLarge = arr[i];
			}
		}

		return sLarge;
	}

	private static int solution(int[] arr) {

		if (arr == null || arr.length < 1) {
			return -1;
		}
		Arrays.sort(arr);
		int largest = arr[arr.length - 1];
		int sLargest = Integer.MIN_VALUE;

		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] != largest) {
				sLargest = arr[i];
				break;
			}
		}

		return sLargest;
	}

}
