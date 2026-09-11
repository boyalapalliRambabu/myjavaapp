package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 3, 3, 5, 6 };
		System.out.println(Arrays.toString(arr));
//		bruteforce
//		int res = solution(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(res);
//		optimal
		int res1 = solution1(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(res1);

	}

	private static int solution1(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}

		return i + 1;
	}

	private static int solution(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		Set<Integer> set = new LinkedHashSet<>();

		for (int i : arr) {
			set.add(i);
		}
		int j = 0;
		for (int i : set) {
			arr[j] = i;
			j++;
		}
		return j;
	}
}
