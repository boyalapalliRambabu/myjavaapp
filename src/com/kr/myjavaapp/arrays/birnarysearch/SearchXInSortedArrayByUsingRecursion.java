package com.kr.myjavaapp.arrays.birnarysearch;

public class SearchXInSortedArrayByUsingRecursion {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 }; // sorted array
		int target = 6; // target element to search

		int val = search(arr, target);
		System.out.println(val);

	}

	private static int search(int[] arr, int target) {
		return binarySerach(arr, 0, arr.length, target);
	}

	private static int binarySerach(int arr[], int low, int high, int target) {
		if (low > high) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if (target == arr[mid]) {
			return mid;
		} else if (target > arr[mid]) {
			return binarySerach(arr, mid + 1, high, target);
		}
		return binarySerach(arr, low, mid - 1, target);
	}
}
