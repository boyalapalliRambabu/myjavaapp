package com.kr.myjavaapp.arrays.medium;

public class BestTimeToBuyAndAellStockLatest {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 5, 8, 11, 9 };
//		brute force
		int profit = solution(arr);
		System.out.println(profit);

//		better
		int profit1 = solution1(arr);
		System.out.println(profit1);

		int profit2 = solution2(arr);
		System.out.println(profit2);
	}

	private static int solution2(int[] arr) {

		int profit = 0;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			profit = Math.max(profit, arr[i] - min);
			min = Math.min(min, arr[i]);
		}
		return profit;
	}

	private static int solution1(int[] arr) {

		int profit = 0;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else {
				profit = Math.max(profit, arr[i] - min);
			}
		}

		return profit;
	}

	private static int solution(int[] arr) {
		int profit = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				profit = Math.max(profit, arr[j] - arr[i]);
			}
		}
		return profit;
	}

}
