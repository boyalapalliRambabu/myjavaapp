package com.kr.myjavaapp.strings;

public class StringToIntegeratoi {

	public static void main(String[] args) {

		String str = " -12345";

		int res = solution(str);
		System.out.println(res);

	}

	private static int solution(String str) {

		int res = 0;
		int sign = 1;

		int i = 0;

		while (i < str.length() && str.charAt(i) == ' ') {
			i++;
		}
		if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
			sign = str.charAt(i) == '-' ? -1 : 1;
			i++;
		}
		while (i < str.length() && Character.isDigit(str.charAt(i))) {

			int digit = str.charAt(i) - '0';

			res = res * 10 + digit;

			i++;

		}
		return res * sign;
	}
}
