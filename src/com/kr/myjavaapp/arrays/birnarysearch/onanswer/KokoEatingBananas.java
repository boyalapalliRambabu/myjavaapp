package com.kr.myjavaapp.arrays.birnarysearch.onanswer;

import java.util.Arrays;

public class KokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
//		brutefoce

		int res = solution(piles, h);
		System.out.println(res);
		int res1 = solution1(piles, h);
		System.out.println(res1);
	}

	private static int solution1(int[] piles, int h) {

		int low = 1, high = Arrays.stream(piles).max().getAsInt();
		while (low <= high) {

			int mid = low + (high - low) / 2;

			int totalH = findTotalHours(piles, mid);

			if (totalH <= h) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return low;

	}

	private static int solution(int[] piles, int h) {

		int maxValue = Arrays.stream(piles).max().getAsInt();

		for (int i = 1; i <= maxValue; i++) {

			int totalHours = findTotalHours(piles, i);

			if (totalHours <= h) {
				return i;
			}
		}

		return maxValue;
	}

	private static int findTotalHours(int[] piles, int hours) {

		int totalHours = 0;
		for (int val : piles) {
			totalHours += Math.ceil((double) val / hours);
		}

		return totalHours;
	}

}
