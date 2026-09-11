package com.kr.myjavaapp.recursion;

public class Print1ToNByUsingBackTracking {

	public static void main(String[] args) {
		int n = 5;
		solution(n, n);
	}

	private static void solution(int i, int n) {
		if (i < 1) {
			return;
		}
		solution(i - 1, n);
		System.out.println(i);
	}

}
