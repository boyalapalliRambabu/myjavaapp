package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class KadanesAlgorithmLatest {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, -2, 7, -4 };
//		brutforce
		int res = solution(arr);
		System.out.println(res);

//		better
		int res1 = solution1(arr);
		System.out.println(res1);

		// optimal
		int res2 = solution2(arr);
		System.out.println(res2);

		// optimal
		int res3[] = solution3(arr);
		System.out.println(Arrays.toString(res3));
	}

	private static int[] solution3(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int initial = 0, start = 0, end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum == 0) {
				initial = i;
			}
			sum += arr[i];
			if (sum > maxSum) {
				maxSum = sum;
				start = initial;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return new int[] { maxSum, start, end };
	}

	private static int solution2(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

	private static int solution1(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}

		}
		return maxSum;
	}

	private static int solution(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

}
