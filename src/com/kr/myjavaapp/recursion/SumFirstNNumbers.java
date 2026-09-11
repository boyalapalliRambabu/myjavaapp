package com.kr.myjavaapp.recursion;

public class SumFirstNNumbers {

	public static void main(String[] args) {
		int sum1 = solution1(5);
		System.out.println("Sum1 " + sum1);
		int sum2 = solution2(5);
		System.out.println("Sum2 " + sum2);

		int sum = solution3(5);
		System.out.println(sum);
	}

	private static int solution1(int j) {

		int sum = 0;
		for (int i = 1; i <= j; i++) {
			sum += i;
		}
		return sum;
	}

	private static int solution2(int j) {
		return (j * (j + 1) / 2);
	}

	private static int solution3(int j) {

		if (j == 1) {
			return 1;
		}
		return j + solution3(j - 1);

	}
}
