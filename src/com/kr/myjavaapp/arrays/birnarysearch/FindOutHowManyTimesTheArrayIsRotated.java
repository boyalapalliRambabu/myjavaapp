package com.kr.myjavaapp.arrays.birnarysearch;

public class FindOutHowManyTimesTheArrayIsRotated {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };

		int res = solution(arr);
		System.out.println(res);
		int res1 = solution1(arr);
		System.out.println(res1);

		int res2 = solution2(arr);
		System.out.println(res2);
	}

	private static int solution2(int[] arr) {
		int low = 0, high = arr.length - 1;
		int index = -1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low = low + 1;
				high = high - 1;
				continue;
			}

			if (arr[low] <= arr[high]) {
				if (arr[low] < ans) {
					ans = arr[low];
					index = low;
				}
			}

			if (arr[low] <= arr[mid]) {
				if (arr[low] < ans) {
					ans = arr[low];
					index = low;
				}
				low = mid + 1;
			} else {
				high = mid - 1;
				if (arr[mid] < ans) {
					ans = arr[mid];
					index = mid;
				}
			}
		}
		return index;
	}

	private static int solution1(int[] arr) {

		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;
		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[low] <= arr[high]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}
			}

			if (arr[low] <= arr[mid]) {

				if (arr[low] < ans) {
					ans = arr[low];
					index = low;
				}
				low = mid + 1;
			} else {
				high = mid - 1;
				if (arr[mid] < ans) {
					ans = arr[mid];
					index = mid;
				}
			}
		}
		return index;
	}

	private static int solution(int[] arr) {
		int index = -1;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
				index = i;
			}
		}
		return index;
	}
}
