package com.kr.myjavaapp.basicmath;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int number = 5;
		boolean result = isPrime(number);
		System.out.println(result);
		
		boolean result1 = getPrimary(number);
		System.out.println(result1);
	}

	public static boolean getPrimary(int n) {

		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;

				if (n / i != i) {
					count++;
				}
			}
		}
		return count == 2;
	}

	public static boolean isPrime(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
