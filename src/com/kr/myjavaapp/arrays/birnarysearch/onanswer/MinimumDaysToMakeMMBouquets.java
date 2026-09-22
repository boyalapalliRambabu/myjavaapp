package com.kr.myjavaapp.arrays.birnarysearch.onanswer;

import java.util.Arrays;

public class MinimumDaysToMakeMMBouquets {
	public static void main(String[] args) {
		int[] bloomDays = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int k = 3; // with number of adjacent flower
		int m = 2; // Number of Bouquests

		int res = solution(bloomDays, m, k);
		System.out.println(res);

		int res1 = solution1(bloomDays, m, k);
		System.out.println(res1);
	}

	private static int solution1(int[] bloomDays, int m, int k) {

		if (k * m > bloomDays.length) {
			return -1;
		}

		int low = Arrays.stream(bloomDays).min().getAsInt();
		int high = Arrays.stream(bloomDays).max().getAsInt();

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isPossible(bloomDays, mid, m, k)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	private static int solution(int[] bloomDays, int m, int k) {

		int min = Arrays.stream(bloomDays).min().getAsInt();
		int max = Arrays.stream(bloomDays).max().getAsInt();

		if (k * m > bloomDays.length) {
			return -1;
		}

		for (int day = min; day <= max; day++) {
			if (isPossible(bloomDays, day, m, k)) {
				return day;
			}
		}

		return -1;
	}

	private static boolean isPossible(int[] bloomDays, int day, int m, int k) {

		int cnt = 0;
		int bouquest = 0;

		for (int bloom : bloomDays) {
			if (bloom <= day) {
				cnt++;
				if (cnt == k) {
					bouquest++;
					cnt = 0;
				}

			} else {
				cnt = 0;
			}
		}

		return bouquest >= m;
	}
}
