package com.kr.myjavaapp.arrays.easy;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[] = { 8, 8, 7, 6, 5 };
		int res = solution(arr);
		System.out.println(res);
	}

	private static int solution(int[] arr) {

		if (arr == null || arr.length < 2) {
			return -1;
		}
		int large = Integer.MIN_VALUE;
		int scLarge = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				scLarge = large;
				large = arr[i];
			} else if (arr[i] < large && arr[i] > scLarge) {
				scLarge = arr[i];
			}
		}
		if (scLarge == Integer.MIN_VALUE) {
			return -1;
		}
		return scLarge;
	}
}
