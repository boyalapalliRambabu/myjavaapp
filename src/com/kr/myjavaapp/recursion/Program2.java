package com.kr.myjavaapp.recursion;

public class Program2 {

	public static void main(String[] args) {
		// Print numbers from 1 to N
		int n = 5;
		solution(1, n);
	}

	private static void solution(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(i);
		solution(i + 1, n);
	}
}
