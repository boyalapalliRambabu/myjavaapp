package com.kr.myjavaapp.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
//		Input : nums = [2, 4, 5, -1, -3, -4]
//		Output : [2, -1, 4, -3, 5, -4]
//	    Explanation:The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

		int arr[] = { 2, 4, 5, -1, -3, -4 };
//		brute force
		int res[] = solution(arr);
		System.out.println(Arrays.toString(res));
//		optimal 
//		int res1[] = solution1(arr);
//		System.out.println(Arrays.toString(res1));
	}

	private static int[] solution(int[] arr) {

		List<Integer> pv = new ArrayList<>();
		List<Integer> nv = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pv.add(arr[i]);
			} else {
				nv.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length/2; i++) {
			arr[2 * i] = pv.get(i);
			arr[2 * i + 1] = nv.get(i);
		}
		return arr;
	}

	private static int[] solution1(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];
		int positveIndex = 0;
		int negativeIndex = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (positveIndex < n) {
					temp[positveIndex] = arr[i];
					positveIndex += 2;
				}
			} else {
				if (negativeIndex < n) {
					temp[negativeIndex] = arr[i];
					negativeIndex += 2;
				}
			}
		}

		return temp;
	}
}
