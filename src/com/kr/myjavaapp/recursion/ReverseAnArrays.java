package com.kr.myjavaapp.recursion;

import java.util.Arrays;

public class ReverseAnArrays {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 7, 3, 1, 6 };
		System.out.println(Arrays.toString(arr));
//		solution(arr, 0, arr.length - 1);
//		System.out.println(Arrays.toString(arr))

		solution(arr, 0);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr, int i) {
		if (i >= arr.length / 2) {
			return;
		}
		swap(arr, i, arr.length - i - 1);
		solution(arr, i + 1);
	}

	private static void swap(int arr[], int i, int j) {
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}
}
