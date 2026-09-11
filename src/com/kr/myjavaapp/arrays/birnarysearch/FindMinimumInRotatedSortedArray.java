package com.kr.myjavaapp.arrays.birnarysearch;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

		int res = solution(arr);
		System.out.println(res);

		int res1 = solution1(arr);
		System.out.println(res1);
	}

	private static int solution1(int[] arr) {

		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[low] <= arr[high]) {
				return Math.min(ans, arr[low]);
			}

			if (arr[low] <= arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid + 1;
			} else {
				ans = Math.min(ans, arr[mid]);
				high = mid - 1;
			}
		}

		return ans;
	}

	private static int solution(int[] arr) {
		int ans = Integer.MAX_VALUE;
		for (int val : arr) {
			if (val < ans) {
				ans = val;
			}
		}
		return ans;
	}
}
