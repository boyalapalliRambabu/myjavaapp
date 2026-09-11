package com.kr.myjavaapp.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		solution(n);
	}

	private static void solution(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
