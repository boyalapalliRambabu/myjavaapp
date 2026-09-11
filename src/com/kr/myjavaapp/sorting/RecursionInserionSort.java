package com.kr.myjavaapp.sorting;

import java.util.Arrays;

public class RecursionInserionSort {
	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));
		solution(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr, int i, int n) {

		if (n == i) {
			return;
		}
		int j = i;
		while (j > 0 && arr[j - 1] > arr[j]) {
			int temp = arr[j - 1];
			arr[j - 1] = arr[j];
			arr[j] = temp;
			j--;
		}

		solution(arr, i + 1, n);
	}
}
