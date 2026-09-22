package com.kr.myjavaapp.arrays.birnarysearch.onanswer;

public class FindNthRootOfANumber {

	public static void main(String[] args) {
		int result = nthRoot(3, 27);
		System.out.println(result);
	}

	private static int nthRoot(int n, int m) {

		int low = 1, high = m;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			System.out.println("mid " + mid);
			int ans = 1;
			for (int i = 1; i <= n; i++) {
				ans = ans * mid;
				if (ans > m) {
					break;
				}
			}

			if (ans == m) {
				return mid;
			}
			if (ans < m) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

}
