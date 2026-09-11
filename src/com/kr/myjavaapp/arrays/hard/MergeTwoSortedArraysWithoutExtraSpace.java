package com.kr.myjavaapp.arrays.hard;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {

	public static void main(String[] args) {
		int[] arr1 = { 0, 0, 0, 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
//	     bruteforce
//		solution(arr1, arr2);

//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));

//		optimal
		solution1(arr1, arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	private static void solution1(int[] arr1, int[] arr2) {
		int left = arr1.length - 1;
		int right =0;
		while (left >= 0 && right < arr2.length) {
			if (arr1[left] > arr2[right]) {
				swap(arr1, left, arr2, right);
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	private static void swap(int[] arr1, int left, int[] arr2, int right) {

		int temp = arr1[left];
		arr1[left] = arr2[right];
		arr2[right] = temp;
	}

	private static void solution(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;
		int arr3[] = new int[n + m];
		int left = 0, right = 0;
		int index = 0;
		while (left < n && right < m) {
			if (arr1[left] <= arr2[right]) {
				arr3[index] = arr1[left];
				index++;
				left++;
			} else {
				arr3[index] = arr2[right];
				index++;
				right++;
			}
		}

		while (left < n) {
			arr3[index++] = arr1[left++];
		}

		while (right < m) {
			arr3[index++] = arr2[right++];
		}

		for (int i = 0; i < arr3.length; i++) {

			if (i < n) {
				arr1[i] = arr3[i];
			} else {
				arr2[i - n] = arr3[i];
			}

		}

		System.out.println(Arrays.toString(arr3));
	}

}
