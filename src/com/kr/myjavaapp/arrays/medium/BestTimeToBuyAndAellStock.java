package com.kr.myjavaapp.arrays.medium;

public class BestTimeToBuyAndAellStock {
	public static void main(String[] args) {
//		Input: arr = [10, 7, 5, 8, 11, 9]
//		Output: 6
//	    Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.
		int arr[] = { 10, 7, 5, 8, 11, 9 };
//		brute force
		int profit = solution(arr);
		System.out.println(profit);
//		optimal approach
		int profit1 = solution1(arr);
		System.out.println(profit1);
	}

	private static int solution1(int[] arr) {
		int minVal = Integer.MAX_VALUE;
		int maxPro = 0;
		for (int val : arr) {
			if (val < minVal) {
				minVal = val;
			} else {
				maxPro = Math.max(maxPro, val - minVal);
			}
		}
		return maxPro;
	}

	private static int solution(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int profit = arr[j] - arr[i];
				max = Math.max(max, profit);
			}
		}
		return max;
	}
}
