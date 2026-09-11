package com.kr.myjavaapp.recursion;

public class PrintNto1ByUsingBackTracking {

	public static void main(String[] args) {
		int n = 5;
		solution(1, n);
	}

	private static void solution(int i, int n) {
		if (i > n) {
			return;
		}
		solution(i + 1, n);
		System.out.println(i);
	}
}
