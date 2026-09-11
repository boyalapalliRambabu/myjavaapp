package com.kr.myjavaapp.arrays.easy;

public class MaximumConsecutiveOnesInArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
		int count = solution(arr);
		System.out.println(count);
	}

	private static int solution(int[] arr) {
		int maxCnt = 0;
		int cnt = 0;
		for (int val : arr) {
			if (val == 1) {
				cnt++;
				maxCnt = Math.max(maxCnt, cnt);
			} else {
				cnt = 0;
			}
		}
		return maxCnt;
	}
}
