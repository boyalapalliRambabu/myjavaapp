package com.kr.myjavaapp.basicmath;

public class CountAllDigitsOfANumber {

	public static void main(String[] args) {
		int n = 329823;
		int res = solution(n);
		System.out.println(res);
	}

	public static int solution(int n) {
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n = n / 10; // removes the last digits
		}
		return count;
	}
}
