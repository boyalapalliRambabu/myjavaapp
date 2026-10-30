package com.kr.myjavaapp.strings;

public class RomanToInteger {

	public static void main(String[] args) {
		String str = "LVIII";
		int res = solution(str);
		System.out.println(res);
	}

	private static int solution(String str) {

		int result = 0;
		for (int i = 0; i < str.length(); i++) {

			int current = getValue(str.charAt(i));

			if (i + 1 < str.length() && current < getValue(str.charAt(i + 1))) {
				result -= current;
			} else {
				result += current;
			}

		}

		return result;
	}

	private static int getValue(char key) {
		return switch (key) {
		case 'I' -> 1;
		case 'V' -> 5;
		case 'X' -> 10;
		case 'L' -> 50;
		case 'C' -> 100;
		case 'D' -> 500;
		case 'M' -> 1000;
		default -> 0;
		};
	}
}
