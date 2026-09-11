package com.kr.myjavaapp.recursion;

public class FactorialOfAGivenNumber {

	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println(res);
		
		int res1 = getFactorial(5);
		System.out.println(res1);
	}

	public static int getFactorial(int n) {

		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
