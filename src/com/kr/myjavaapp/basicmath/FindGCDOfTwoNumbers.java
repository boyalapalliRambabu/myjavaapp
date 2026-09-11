package com.kr.myjavaapp.basicmath;

public class FindGCDOfTwoNumbers {

	public static void main(String[] args) {
		int n1 = 9, n2 = 12;
		int res = solution(n1, n2);
		System.out.println(res);

		int res1 = solution1(n1, n2);
		System.out.println(res1);

	}

	private static int solution(int n1, int n2) {
		int gcd = 1;
		for (int i = 1; i < Math.min(n1, n2); i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	private static int solution1(int n1, int n2) {
		int gcd = 1;
		for (int i = Math.min(n1, n2); i >= 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}
}
