package com.kr.myjavaapp.arrays.medium;

public class KadanesAlgorithm {

	public static void main(String[] args) {
//		Input: nums = [2, 3, 5, -2, 7, -4]
//      Output: 15
//      Explanation:
//		The subarray from index 0 to index 4 has the largest sum = 15
//      brute force
//		int arr[] = { 2, 3, 5, -2, 7, -4 };
//		int res = solution(arr);
//		System.out.println(res);
//		better
//		int arr[] = { 2, 3, 5, -2, 7, -4 };
//		int res1 = solution1(arr);
//		System.out.println(res1);
//		Optimal
//		int arr[] = { 2, 3, 5, -2, 7, -4 };
//		int res1 = solution2(arr);
//		System.out.println(res1);
//		optimal
		int arr[] = { 2, 3, 5, -2, 7, -4 };
		int res1 = solution3(arr);
		System.out.println(res1);
	}

	private static int solution3(int[] arr) {
		int sum = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}
		return max;
	}

	private static int solution2(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

	private static int solution1(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

	
}
