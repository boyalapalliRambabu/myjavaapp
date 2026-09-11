package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class SortAnArrayOf0s1sAnd2s {

	public static void main(String[] args) {
//		Input: nums = [1, 0, 2, 1, 0]
//		Output: [0, 0, 1, 1, 2]

		int arr[] = { 1, 0, 2, 1, 0 };

//		brute force
		int res[] = solution(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] solution(int[] arr) {
		int count = 0, count1 = 0, count2 = 0;

		for (int n : arr) {
			if (n == 0) {
				count++;
			} else if (n == 1) {
				count1++;
			} else {
				count2++;
			}
		}
		int index = 0;
		while (count-- > 0) {
			arr[index++] = 0;
		}
		while (count1-- > 0) {
			arr[index++] = 1;
		}
		while (count2-- > 0) {
			arr[index++] = 2;
		}
		return arr;
	}
}
