package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementIILatest {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 1, 3, 2, 2 };
//		brute
		List<Integer> res = solution(arr);
		System.out.println(res);

//		better
		List<Integer> res1 = solution1(arr);
		System.out.println(res1);

//		optimal
		List<Integer> res2 = solution2(arr);
		System.out.println(res2);
	}

	private static List<Integer> solution2(int[] arr) {

		int cnt1 = 0, cnt2 = 0;
		int val1 = 0, val2 = 0;
		List<Integer> ls = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (cnt1 == 0) {
				cnt1++;
				val1 = arr[i];
			} else if (cnt2 == 0) {
				cnt2++;
				val2 = arr[i];
			} else if (arr[i] == val1) {
				cnt1++;
			} else if (arr[i] == val2) {
				cnt2++;
			} else {
				cnt1--;
				cnt2--;
			}

		}
		cnt1 = 0;
		cnt2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val1) {
				cnt1++;
			} else if (arr[i] == val2) {
				cnt2++;
			}
		}
		if (cnt1 > arr.length / 3) {
			ls.add(val1);
		}
		if (cnt2 > arr.length / 3) {
			ls.add(val2);
		}
		return ls;
	}

	private static List<Integer> solution1(int[] arr) {

		int minMax = (arr.length / 3) + 1;

		List<Integer> ls = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if (map.get(arr[i]) == minMax) {
				ls.add(arr[i]);
			}
		}
		return ls;
	}

	private static List<Integer> solution(int[] arr) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			if (list.isEmpty() || list.get(0) != arr[i]) {
				int cnt = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						cnt++;
					}

				}

				if (cnt > arr.length / 3) {
					list.add(arr[i]);
				}

				if (list.size() == 2) {
					break;
				}
			}

		}

		return list;
	}

}
