package com.kr.myjavaapp.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 6;
		int res = solution(n);
		System.out.println(res);
	}

	private static int solution(int n) {
		if (n <= 1) {
			return n;
		}
		int fLast = solution(n - 1);
		int sLast = solution(n - 2);
		return fLast + sLast;
	}
}
