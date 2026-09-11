package com.kr.myjavaapp.arrays.birnarysearch;

public class SingleElementInASortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
		int res = solution(arr);
		System.out.println(res);

		int res1 = solution1(arr);
		System.out.println(res1);

	}

	private static int solution1(int[] arr) {

		if (arr.length == 1) {
			return arr[0];
		}

		if (arr[0] != arr[1]) {
			return arr[0];
		}
		if (arr[arr.length - 1] != arr[arr.length - 2]) {
			return arr[arr.length - 1];
		}

		int low = 1, high = arr.length - 2;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
				return arr[mid];
			}

			if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || mid % 2 == 0 && arr[mid] == arr[mid + 2]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int solution(int[] arr) {

		if (arr.length == 1) {
			return arr[0];
		}

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				if (arr[i] != arr[i + 1]) {
					return arr[0];
				}
			} else if (i == arr.length - 1) {
				if (arr[i] != arr[i - 1]) {
					return arr[i];
				}
			} else {
				if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
}
