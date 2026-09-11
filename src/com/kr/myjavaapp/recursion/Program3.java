package com.kr.myjavaapp.recursion;

public class Program3 {
	public static void main(String[] args) {
//     print numbers from n to 1
		int n = 5;
		solution(n, n);
	}
	private static void solution(int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		solution(i - 1, n);
	}
}
