package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumLatest {

	public static void main(String[] args) {
		int arr[] = { 2, -2, 0, 3, -3, 5 };
//		brute
//		List<List<Integer>> res = solution(arr);
//		System.out.println(res);

//		better
//		List<List<Integer>> res1 = solution1(arr);
//		System.out.println(res1);

//		optimal
		List<List<Integer>> res2 = solution2(arr);
		System.out.println(res2);
	}

	private static List<List<Integer>> solution2(int[] arr) {
		Arrays.sort(arr);

		List<List<Integer>> ls = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int left = i + 1, right = arr.length - 1;

			while (left < right) {

				int sum = arr[i] + arr[left] + arr[right];
				if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				} else {
					ls.add(Arrays.asList(arr[i], arr[left], arr[right]));
					left++;
					right--;
					while (left <= right && arr[left] == arr[left - 1]) {
						left++;
					}
					while (left <= right && arr[right] == arr[right + 1]) {
						right--;
					}
				}
			}
		}
		return ls;
	}

	private static List<List<Integer>> solution1(int[] arr) {
		Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			Set<Integer> tempSet = new HashSet<>();
			for (int j = i + 1; j < n; j++) {
				int thirdVal = -(arr[i] + arr[j]);
				if (tempSet.contains(thirdVal)) {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], thirdVal);
					Collections.sort(temp);
					set.add(temp);
				}
				tempSet.add(arr[j]);
			}
		}
		return new ArrayList<>(set);
	}

	private static List<List<Integer>> solution(int[] arr) {

		Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
						Collections.sort(temp);
						set.add(temp);
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

}
