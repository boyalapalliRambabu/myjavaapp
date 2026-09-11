package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 3, 3, 5, 6 };
//		Brute force
		int res1 = solution1(arr);
		System.out.println(res1);
		System.out.println(Arrays.toString(arr));

//Optimal
//		int res = solution(arr);
//		System.out.println(res);
//		System.out.println(Arrays.toString(arr));

	}

	private static int solution1(int[] arr) {

		Set<Integer> set = new HashSet<>();
		int k = 0;
		for (int num : arr) {
			if (!set.contains(num)) {
				set.add(num);
				arr[k] = num;
				k++;
			}
		}

		return k;
	}

	private static int solution(int[] arr) {

		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[k]) {
				arr[++k] = arr[i];
			}
		}
		return k + 1;
	}
}
