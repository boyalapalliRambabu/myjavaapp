package com.kr.myjavaapp.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;
		solution(n);
	}

	private static void solution(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
