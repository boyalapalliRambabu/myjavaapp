package com.kr.myjavaapp.arrays.birnarysearch;

public class FloorAndSeling {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 7, 8, 10 };
		int x = 5;
		int findFloor = findFloor(arr, x);
		System.out.println(findFloor);

		int findCeling = findCeling(arr, x);
		System.out.println(findCeling);
	}

	private static int findCeling(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= x) {
				ans = arr[mid];
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int findFloor(int[] arr, int x) {

		int low = 0, high = arr.length - 1;
		int ans = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] <= x) {
				ans = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}
}
