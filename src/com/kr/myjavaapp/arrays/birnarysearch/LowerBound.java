package com.kr.myjavaapp.arrays.birnarysearch;

public class LowerBound {
	public static void main(String[] args) {

		int[] arr = { 3, 5, 8, 15, 19 }; // Sorted array
		int target = 9; // Target value

		int res = solution(arr, target);
		System.out.println(res);

		int res1 = solution1(arr, target);
		System.out.println(res1);
	}

	private static int solution1(int[] arr, int target) {
		int low = 0, high = arr.length;
		int ans = 0;
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

	private static int solution(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= target) {
				return i;
			}
		}

		return arr.length;
	}

}
