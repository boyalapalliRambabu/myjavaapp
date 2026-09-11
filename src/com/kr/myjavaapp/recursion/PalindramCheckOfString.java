package com.kr.myjavaapp.recursion;

public class PalindramCheckOfString {

	public static void main(String[] args) {
		String str = "malayalam";
		boolean res = solution(str, 0);
		System.out.println(res);
	}

	private static boolean solution(String str, int i) {

		if (i >= str.length() / 2) {
			return true;
		}

		if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
			return false;
		}

		return solution(str, i + 1);
	}

}
