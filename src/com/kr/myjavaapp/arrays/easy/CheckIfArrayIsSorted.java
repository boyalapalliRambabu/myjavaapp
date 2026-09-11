package com.kr.myjavaapp.arrays.easy;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 4, 5 };
		boolean res = solution(arr);
		System.out.println(res);

	}

	private static boolean solution(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
