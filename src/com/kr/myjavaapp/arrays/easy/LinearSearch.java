package com.kr.myjavaapp.arrays.easy;

public class LinearSearch {

	public static void main(String[] args) {

//	 nums = [2, 3, 4, 5, 3], target = 3
//	 Output: 1

		int arr[] = { 2, 3, 4, 5, 3 };
		int target = 3;
		int res = solution(arr, target);
		System.out.println(res);

	}

	private static int solution(int[] arr, int target) {

		if (arr.length == 0 || arr == null) {
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
