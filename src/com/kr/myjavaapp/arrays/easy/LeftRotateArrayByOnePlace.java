package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		solution(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr) {

		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;

	}

}
