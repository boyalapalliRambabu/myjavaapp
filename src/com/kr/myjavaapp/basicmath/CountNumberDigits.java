package com.kr.myjavaapp.basicmath;

public class CountNumberDigits {
	public static void main(String[] args) {
		int num = 89324;
		int res = bruteForceApproach(num);

		System.out.println(res);
		int res1 = optimalApproach(num);
		System.out.println(res1);
	}

	private static int optimalApproach(int num) {
		int count = (int) (Math.log10(num) + 1);
		return count;
	}

	private static int bruteForceApproach(int num) {
		int count = 0;
		while (num > 0) {
			count = count + 1;
			num = num / 10;
		}
		return count;
	}

}
