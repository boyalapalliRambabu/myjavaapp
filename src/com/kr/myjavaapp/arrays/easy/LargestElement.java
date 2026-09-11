package com.kr.myjavaapp.arrays.easy;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 6, 1 };
		int result = solution(arr);
		System.out.println(result);
	}

	private static int solution(int[] arr) {

		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		return large;
	}
}
