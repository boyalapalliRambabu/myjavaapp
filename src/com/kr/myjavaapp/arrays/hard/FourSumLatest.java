package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FourSumLatest {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, 5, 7, 9 };
		int target = 7;
//		bruteforce
		List<List<Integer>> res = solution(arr, target);
		System.out.println(res);

//		better
		List<List<Integer>> res1 = solution1(arr, target);
		System.out.println(res1);

//		optimal
		List<List<Integer>> res2 = solution2(arr, target);
		System.out.println(res1);

	}

	private static List<List<Integer>> solution2(int[] arr, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}
				int left = j + 1, right = n - 1;
				while (left < right) {
					long sum = arr[i] + arr[j];
					sum += arr[left];
					sum += arr[right];
					if (sum == target) {
						res.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
						left++;
						right--;
						while (left < right && arr[left] == arr[left - 1]) {
							left++;
						}
						while (left < right && arr[right] == arr[right + 1]) {
							right--;
						}
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return res;
	}

	private static List<List<Integer>> solution1(int[] arr, int target) {

		Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				Set<Integer> tempSet = new HashSet<>();
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					int val = target - (sum);
					if (tempSet.contains(val)) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], val);
						Collections.sort(temp);
						set.add(temp);
					}
					tempSet.add(arr[k]);
				}
			}
		}
		return new ArrayList<>(set);
	}

	private static List<List<Integer>> solution(int[] arr, int target) {

		Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					for (int l = k + 1; l < n; l++) {
						long sum = arr[i] + arr[j];
						sum += arr[k];
						sum += arr[l];
						if (sum == target) {
							List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
							Collections.sort(temp);
							set.add(temp);
						}
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

}
