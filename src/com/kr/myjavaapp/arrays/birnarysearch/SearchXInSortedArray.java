package com.kr.myjavaapp.arrays.birnarysearch;

public class SearchXInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 }; // sorted array
		int target = 6; // target element to search

		int val = binarySearch(arr, target);
		System.out.println(val);

	}

	private static int binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
