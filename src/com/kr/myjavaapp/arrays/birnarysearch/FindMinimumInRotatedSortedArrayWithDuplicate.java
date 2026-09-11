package com.kr.myjavaapp.arrays.birnarysearch;

public class FindMinimumInRotatedSortedArrayWithDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 1 };
		int res = solution(arr);
		System.out.println(res);
	}

	private static int solution(int[] arr) {

		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				ans = Math.min(ans, arr[low]);
				low = low + 1;
				high = high - 1;
				continue;
			}
			if (arr[low] <= arr[high]) {
				ans = Math.min(ans, arr[low]);
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

}
