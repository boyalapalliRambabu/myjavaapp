package com.kr.myjavaapp.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));
		int result[] = solution(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean isSorted = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = true;
				}
			}
			if (!isSorted) {
				break;
			}
		}
		return arr;
	}

//	private static int[] solution(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			boolean isSorted = false;
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					isSorted = true;
//				}
//			}
//			if (!isSorted) {
//				break;
//			}
//		}
//		return arr;
//	}
}
