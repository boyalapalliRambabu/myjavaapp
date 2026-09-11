package com.kr.myjavaapp.arrays.easy;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
//		Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//		Output: 4
		int arr[] = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
//		brute
//		int res = solution(arr, k);
//		System.out.println(res);

//		optimal
		int res = solution1(arr, k);
		System.out.println(res);
	}

	private static int solution1(int[] arr, int k) {
		int n = arr.length;

		int left = 0, right = 0;
		int max = 0;
		int sum = arr[0];
		while (right < n) {

			while (left <= right && sum > k) {
				sum -= arr[left];
				left++;
			}

			if (sum == k) {
				if (right - left + 1 > max) {
					max = right - left + 1;
				}
			}
			right++;
			if (right < n) {
				sum += arr[right];
			}

		}

		return max;
	}

	private static int solution(int[] arr, int k) {

		int n = arr.length;
		int max = 0;
		for (int start = 0; start < n; start++) {
			for (int end = start; end < n; end++) {

				int sum = 0;
				for (int i = start; i <= end; i++) {
					sum += arr[i];
				}
				System.out.println("sum " + sum);
				if (sum == k) {
//					max = Math.max(max, end - start + 1);
					if (end - start + 1 > max) {
						max = end - start + 1;
					}
				}
			}
		}

		return max;
	}

}
