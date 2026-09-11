package com.kr.myjavaapp.basicmath;

public class CheckIfANumberIsArmstrongNumberOrNot {

	public static void main(String[] args) {
		int num = 153;
		boolean res = solution(num);
		System.out.println(res);

	}

	private static boolean solution(int num) {
		int temp = num;

		int n = num;
		int cnt = 0;
		int sum = 0;
		while (num > 0) {
			cnt = cnt + 1;
			num = num / 10;
		}
		while (n > 0) {
			sum = (int) (sum + Math.pow(n % 10, cnt));
			n = n / 10;
		}
		return temp == sum;
	}
}
