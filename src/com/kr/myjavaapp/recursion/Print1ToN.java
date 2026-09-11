package com.kr.myjavaapp.recursion;

public class Print1ToN {

	public static void main(String[] args) {
		solution(1, 5);
	}
	public static void solution(int c, int n) {

		if (c > n)
			return;
		System.out.println(c);
		solution(c + 1, n);
	}
}
