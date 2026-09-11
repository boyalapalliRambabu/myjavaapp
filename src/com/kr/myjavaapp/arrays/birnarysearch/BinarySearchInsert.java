package com.kr.myjavaapp.arrays.birnarysearch;

public class BinarySearchInsert {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7 };
		int x = 6;

		int res = insertPosition(arr, x);
		System.out.println(res);

	}

	private static int insertPosition(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
}
