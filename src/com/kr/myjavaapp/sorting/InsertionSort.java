package com.kr.myjavaapp.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));
		int result[] = solution(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int val = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}

		return arr;
	}

}
