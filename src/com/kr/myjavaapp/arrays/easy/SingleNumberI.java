package com.kr.myjavaapp.arrays.easy;

public class SingleNumberI {

	public static void main(String[] args) {
//		Input : nums = [1, 2, 2, 4, 3, 1, 4]
//		Output : 3
		int arr[] = { 1, 2, 2, 4, 3, 1, 4 };
//		int res = solution(arr);
//		System.out.println(res);
		int res = solution1(arr);
		System.out.println(res);
	}

	private static int solution1(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

		int freq[] = new int[max + 1];
		for (int j = 0; j < arr.length; j++) {
			freq[arr[j]]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (freq[arr[i]] == 1) {
				return arr[i];
			}
		}
		return -1;
	}

// brute approach
	private static int solution(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int cont = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cont++;
				}
			}
			if (cont == 1) {
				return arr[i];
			}
		}
		return -1;
	}
}
