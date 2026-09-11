package com.kr.myjavaapp.basicmath;

public class NumberIsArmstrong {
	public static void main(String[] args) {
		int number = 153;

		// Use class method to check
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	public static boolean isArmstrong(int n) {
		int sum = 0;
		int k = String.valueOf(n).length();
		int num=n;
		while(num>0) {
			int digit=n%10;
			sum+=Math.pow(digit, k);
		}
		return n==sum;
	}
}
