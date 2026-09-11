package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class SortAnArrayOf0s1sAnd2sLatest {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 1, 0 };
		System.out.println(Arrays.toString(arr));
		// bruteforce
//		solution(arr);
		System.out.println(Arrays.toString(arr));

//		better
		solution1(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution1(int[] arr) {

		int low = 0, mid = 0, hight = arr.length - 1;

		while (mid <= hight) {

			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				swap(arr, mid, hight);
				hight--;
			}
		}
	}

	private static void swap(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void solution(int[] arr) {

		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;

		for (int val : arr) {

			if (val == 0) {
				cnt0++;
			} else if (val == 1) {
				cnt1++;
			} else if (val == 2) {
				cnt2++;
			}
		}
		System.out.println(cnt0);
		System.out.println(cnt1);
		System.out.println(cnt2);

		for (int i = 0; i < cnt0; i++) {
			arr[i] = 0;
		}
		for (int i = cnt0; i < cnt0 + cnt1; i++) {
			arr[i] = 1;
		}
		for (int i = cnt0 + cnt1; i < arr.length; i++) {
			arr[i] = 2;
		}
	}
}
