package com.kr.myjavaapp.recursion;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(fibonacci(n)));
	}

	public static int getFibonacci(int N) {
		// Base case: return N if it's 0 or 1
		if (N <= 1) {
			return N;
		}

		// Recursive case: calculate previous two terms
		int last = getFibonacci(N - 1); // (N-1)th term
		int slast = getFibonacci(N - 2); // (N-2)th term

		return last + slast;
	}

	private static int[] fibonacci(int i) {

		if (i == 0) {
			return new int[] { 0 };
		}
		if (i == 1) {
			return new int[] { 0, 1 };
		}
		int arr[] = new int[i + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int j = 2; j < arr.length; j++) {
			arr[j] = arr[j - 1] + arr[j - 2];
		}
		return arr;
	}
}
