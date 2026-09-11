package com.kr.myjavaapp.recursion;

public class Problem1 {

	public static void main(String[] args) {

		int val = 5;
		String name="Dev";
		printName(name , 0 ,val);
	}

	private static void printName(String name, int val, int n) {
		if (val == n) {
			return;
		}
		System.out.println(name);
		printName(name, val + 1, n);
	}
}
