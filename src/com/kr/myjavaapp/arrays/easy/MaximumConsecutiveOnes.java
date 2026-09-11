package com.kr.myjavaapp.arrays.easy;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
		int count = solution(arr);
		System.out.println(count);
	}

	private static int solution(int[] arr) {
		int max = 0;

		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 1) {
				count++;
			} else {
				count = 0;
			}
			if (count > max) {
				max = count;
			}
		}

		return max;
	}
}