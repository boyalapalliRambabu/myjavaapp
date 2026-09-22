package com.kr.myjavaapp.arrays.birnarysearch.onanswer;

public class FindingSqrtOfANumberUsingBinarySearch {

	public static void main(String[] args) {
		int n = 27;

		int ans = solution(n);
		System.out.println(ans);

		int ans1 = solution1(n);
		System.out.println(ans1);
	}

	private static int solution1(int n) {

		if (n < 2) {
			return n;
		}

		int low = 1, high = n / 2;
		int ans = 0;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (mid * mid <= n) {
				ans = mid;
				low = mid + 1;
			} else {

				high = mid - 1;
			}
		}

		return ans;
	}

	private static int solution(int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {

			if ((long) i * i <= n) {
				ans = i;
			} else {
				break;
			}
		}
		return ans;
	}
}
