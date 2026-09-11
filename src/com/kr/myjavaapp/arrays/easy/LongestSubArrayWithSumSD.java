package com.kr.myjavaapp.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumSD {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 2, 7, 1, 9 };
		int k = 15;

//		bruteforce
		int ans = solution(arr, k);
		System.out.println(ans);

//		better
		int ans2 = solution2(arr, k);
		System.out.println(ans2);

//		optimal
		int ans1 = solution1(arr, k);
		System.out.println(ans1);
	}

	private static int solution2(int[] arr, int k) {
		int max = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == k) {
				max = i + 1;
			}
			if (map.containsKey(sum - k)) {
				max = Math.max(max, i - map.get(sum - k));
			}
			map.putIfAbsent(sum, i);
		}
		return max;
	}

	private static int solution1(int[] arr, int k) {

		int left = 0, right = 0;
		int maxLength = 0;
		int sum = arr[0];
		int n = arr.length;
		while (right < n) {

			while (left <= right && sum > k) {
				sum -= arr[left];
				left++;
			}
			if (sum == k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}
			right++;
			if (right < n) {
				sum += arr[right];
			}
		}

		return maxLength;
	}

	private static int solution(int[] arr, int target) {

		int n = arr.length;
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				if (sum == target) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}

		}

		return maxLength;
	}

}
