package com.kr.myjavaapp.arrays.easy;

public class LinearSearchInArrays {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 3 };
		int target = 3;
		int res = solution(arr, target);
		System.out.println(res);
	}

	private static int solution(int[] arr, int target) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
