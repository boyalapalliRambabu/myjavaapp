package com.kr.myjavaapp.sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));
		solution(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr, int n) {

		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		solution(arr, n - 1);
	}
}
