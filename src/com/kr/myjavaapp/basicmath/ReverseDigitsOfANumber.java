package com.kr.myjavaapp.basicmath;

public class ReverseDigitsOfANumber {

	public static void main(String[] args) {
		int num = 12345;
		int res = solution(num);
		System.out.println(res);
	}

	private static int solution(int num) {

		int res = 0;

		while (num > 0) {
			res = res * 10 + (num % 10);
			num = num / 10;
		}

		return res;
	}
}
