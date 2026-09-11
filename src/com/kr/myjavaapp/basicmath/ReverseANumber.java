package com.kr.myjavaapp.basicmath;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(reverseNumber(num)); // Output: 54321
	}

	private static int reverseNumber(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			
			rev = rev * 10 + digit;
			System.out.println(rev);
			num = num / 10;
		}

		return rev;
	}
}
