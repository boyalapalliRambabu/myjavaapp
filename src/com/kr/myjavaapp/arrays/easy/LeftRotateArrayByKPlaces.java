package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByKPlaces {

	public static void main(String[] args) {
//		Input: nums = [1, 2, 3, 4, 5, 6], k = 2
//		Output: nums = [3, 4, 5, 6, 1, 2]
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 2;
//		Brute Force Approach
//		solution(arr, k);
//		System.out.println(Arrays.toString(arr));

//		Optimal;
		solution1(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution1(int[] arr, int k) {
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	private static void solution(int[] arr, int k) {
		int temp[] = new int[k];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}

		for (int j = k; j < arr.length; j++) {
			arr[j - k] = arr[j];
		}

		for (int i = 0; i < k; i++) {
			arr[arr.length - k + i] = temp[i];
		}
	}

}
