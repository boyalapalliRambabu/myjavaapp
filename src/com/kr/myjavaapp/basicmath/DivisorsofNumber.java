package com.kr.myjavaapp.basicmath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorsofNumber {

	public static void main(String[] args) {
		int n = 36;
		int[] res = divisors(n);
		System.out.println("Res " + Arrays.toString(res));

		List<Integer> res1 = getDivisors(n);
		System.out.println("Res " + res1);
	}

	public static List<Integer> getDivisors(int N) {
		// Create a list to store divisors
		List<Integer> res = new ArrayList<>();

		// Loop from 1 to square root of N
		for (int i = 1; i <= Math.sqrt(N	); i++) {
			// Check if i divides N
			if (N % i == 0) {
				// Add i to result
				res.add(i);

				// If N / i is different from i, add N / i too
				if (i != N / i) {
					res.add(N / i);
				}
			}
		}

		// Return the list of divisors
		return res;
	}

	public static int[] divisors(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}

		}
		return list.stream().mapToInt(i -> i).toArray();
	}

}
