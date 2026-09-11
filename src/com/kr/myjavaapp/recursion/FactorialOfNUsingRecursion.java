package com.kr.myjavaapp.recursion;

public class FactorialOfNUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		int res = solution(n);
		System.out.println(res);
	}

	private static int solution(int n) {
		if (n == 1) {
			return 1;
		}
		return n * solution(n - 1);
	}
}
