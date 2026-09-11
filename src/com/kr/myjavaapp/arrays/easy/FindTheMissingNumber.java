package com.kr.myjavaapp.arrays.easy;

public class FindTheMissingNumber {

	public static void main(String[] args) {
//		int arr[] = { 0, 2, 3, 1, 4 };
		int arr[] = { 1, 2, 4, 5 };

//		bruteforce
		int res = solution(arr);
		System.out.println(res);
//      better
		int res1 = solution1(arr);
		System.out.println(res1);
//		optimal1
		int res2 = solution2(arr);
		System.out.println(res2);
//		optimal2
		int res3 = solution3(arr);
		System.out.println(res3);
	}

	private static int solution3(int[] arr) {
		int xor1 = 0;
		int n = arr.length + 1;
		int xor2 = 0;

		for (int i = 1; i <= n; i++) {
			xor1 = xor1 ^ i;
		}

		for (int val : arr) {
			xor2 ^= val;
		}

		return xor1 ^ xor2;
	}

	private static int solution2(int[] arr) {
		int n = arr.length + 1;
		int sum = 0;
		for (int val : arr) {
			sum += val;
		}
		int expSum = n * (n + 1) / 2;
		return expSum - sum;
	}

	private static int solution(int[] arr) {
		int n = arr.length + 1;
		for (int i = 1; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] == i) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				return i;
			}
		}
		return -1;
	}

	private static int solution1(int[] arr) {
		int n = arr.length + 1;

		int hash[] = new int[n + 1];

		for (int val : arr) {

			hash[val] = 1;
		}

		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}
}
