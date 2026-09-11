package com.kr.myjavaapp.recursion;

public class Program1 {

	public static void main(String[] args) {
//       print name n number of time
		int n = 3;
		solution(1, n);
	}

	private static void solution(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println("Kri");
		solution(i + 1, n);
	}
}
