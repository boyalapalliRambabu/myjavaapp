package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
//      Input: nums = [0, 1, 4, 0, 5, 2]
//		Output: [1, 4, 5, 2, 0, 0]
		int arr[] = { 0, 1, 4, 0, 5, 2 };
//		solution(arr);
//		System.out.println(Arrays.toString(arr));
		solution1(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution1(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
			}
		}

	}

	private static void solution(int[] arr) {

		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[k++] = arr[i];
			}
		}
		while (k < arr.length) {
			arr[k++] = 0;
		}

	}
}
