package com.kr.myjavaapp.strings;

public class LargestOddNumberInaString {

	public static void main(String[] args) {

		String nums = "35420";

//		String res = solution(nums);
//		System.out.println(res);
		String res1 = solution1(nums);
		System.out.println(res1);
	}

	private static String solution1(String nums) {

		int lastOdd = -1;
		for (int i = 0; i < nums.length(); i++) {
			int digit = nums.charAt(i) - '0';

			if (digit % 2 != 0) {
				lastOdd = i;
			}

		}

		if (lastOdd == -1) {
			return "";
		}
		return nums.substring(0, lastOdd + 1);
	}

	private static String solution(String nums) {

		for (int i = nums.length() - 1; i >= 0; i--) {

			int digit = nums.charAt(i) - '0';
			if (digit % 2 != 0) {
				return nums.substring(0, i + 1);
			}

		}

		return "";
	}
}
