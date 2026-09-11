package com.kr.myjavaapp.arrays.birnarysearch;

import java.util.Arrays;

public class FirstAndLastOccurrence {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int res[] = findFirstAndLastOccurrence(arr, target);

		System.out.println(Arrays.toString(res));

		int res1[] = findFirstAndLastOccurrence1(arr, target);

		System.out.println(Arrays.toString(res1));
	}

	private static int[] findFirstAndLastOccurrence1(int[] arr, int target) {

		int fOcc = findFstOcc(arr, target);

		if (fOcc == -1) {
			return new int[] { -1, -1 };
		}
		return new int[] { fOcc, findLstOcc(arr, target) };
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

	private static int[] findFirstAndLastOccurrence(int[] arr, int target) {
		int lowRes = findLowBound(arr, target);

		if (arr.length == lowRes || target != arr[lowRes]) {
			return new int[] { -1, -1 };
		}
		return new int[] { lowRes, findHighBound(arr, target) - 1 };
	}

	private static int findHighBound(int[] arr, int target) {

		int low = 0, high = arr.length - 1;

		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return ans;
	}

	private static int findLowBound(int[] arr, int target) {

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
