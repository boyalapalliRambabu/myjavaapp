package com.kr.myjavaapp.arrays.easy;

public class CheckIfTheArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		boolean isStatus = solution(arr);
		System.out.println(isStatus);
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
