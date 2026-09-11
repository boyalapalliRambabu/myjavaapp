package com.kr.myjavaapp.recursion;

public class SumofNnumbers {

	public static void main(String[] args) {
		int n = 5;
		int res = solution(n);
		System.out.println(res);
		paramiterised(n, 0);
	}

	private static void paramiterised(int i, int sum) {
		if (i < 0) {
			System.out.println(sum);
			return;
		}
		paramiterised(i - 1, sum + i);
	}

	private static int solution(int n) {
		if (n == 0) {
			return 0;
		}
		return n + solution(n - 1);
	}
}
