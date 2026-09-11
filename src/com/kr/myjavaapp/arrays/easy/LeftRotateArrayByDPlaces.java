package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 2;
//		System.out.println(Arrays.toString(arr));
////		bruteforce
////		solution(arr, k);
//		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
//		Optimal
		solution1(arr, k);
		System.out.println(Arrays.toString(arr));

	}

	private static void solution1(int[] arr, int k) {
		if (arr == null || arr.length == 0) {
			return;
		}
		k = k % arr.length;

		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	private static void reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void solution(int[] arr, int k) {
		if (arr == null || arr.length == 0) {
			return;
		}
		k = k % arr.length;

		int temp[] = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		for (int i = k; i < arr.length; i++) {
			arr[i - k] = arr[i];
		}
		for (int i = arr.length - k; i < arr.length; i++) {
			arr[i] = temp[i - (arr.length - k)];
		}

	}

}
