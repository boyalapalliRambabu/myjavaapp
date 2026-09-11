package com.kr.myjavaapp.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));
		int result[] = solution(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
}
