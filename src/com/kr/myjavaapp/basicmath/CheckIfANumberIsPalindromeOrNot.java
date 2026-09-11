package com.kr.myjavaapp.basicmath;

public class CheckIfANumberIsPalindromeOrNot {
	public static void main(String[] args) {
		int num = 4554;
		boolean res = solution(num);
		System.out.println(res);
	}

	private static boolean solution(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return temp == rev;
	}

}
