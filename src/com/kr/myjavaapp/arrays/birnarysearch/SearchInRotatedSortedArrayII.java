package com.kr.myjavaapp.arrays.birnarysearch;

public class SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
		int k = 3;
		boolean res = solution(arr, k);
		System.out.println(res);
		boolean res1 = solution1(arr, k);
		System.out.println(res1);
	}

	private static boolean solution1(int[] arr, int k) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				return true;
			}
			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low = low + 1;
				high = high - 1;
				continue;
			}

			if (arr[low] <= arr[mid]) {
				if (k >= arr[low] && k < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {

				if (k >= arr[mid] && k <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}

		return false;
	}

	private static boolean solution(int[] arr, int k) {
		for (int val : arr) {
			if (val == k) {
				return true;
			}
		}
		return false;
	}

}
