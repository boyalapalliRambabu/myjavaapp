package com.kr.myjavaapp.arrays.birnarysearch.onanswer;

import java.util.Arrays;

public class FindTheSmallestDivisor {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int limit = 8;
//		bruteforce

		int res = solution(nums, limit);
		System.out.println(res);

//		optimal
		int result = solution1(nums, limit);
		System.out.println(result);
	}

	private static int solution1(int[] nums, int limit) {
		int low = 1, high = Arrays.stream(nums).max().getAsInt();
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (sumOfDivisor(nums, mid) <= limit) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	private static int solution(int[] nums, int limit) {
		int max = Arrays.stream(nums).max().getAsInt();
		for (int d = 1; d <= max; d++) {
			long sum = 0;
			sum = sumOfDivisor(nums, d);
			if (sum <= limit) {
				return d;
			}
		}
		return max;
	}

	private static long sumOfDivisor(int[] nums, int d) {
		long sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += Math.ceil((double) nums[i] / d);
		}
		return sum;
	}
}
