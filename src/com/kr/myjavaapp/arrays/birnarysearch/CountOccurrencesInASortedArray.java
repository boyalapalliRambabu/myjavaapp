package com.kr.myjavaapp.arrays.birnarysearch;

public class CountOccurrencesInASortedArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
		int x = 8;
		int res = solution(arr, x);
		System.out.println(res);
		int res1 = countOccurrences(arr, x);
		System.out.println(res1);
	}

	private static int solution(int[] arr, int x) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				cnt++;
			}
		}
		return cnt;
	}

	private static int countOccurrences(int[] arr, int target) {

		int fOcc = findFstOcc(arr, target);
		if (fOcc == -1) {
			return 0;
		}
		return findLstOcc(arr, target) - fOcc + 1;
	}

	private static int findLstOcc(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				ans = mid;

				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	private static int findFstOcc(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				ans = mid;

				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
