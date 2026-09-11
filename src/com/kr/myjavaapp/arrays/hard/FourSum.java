package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
//		        Input: nums = [1, -2, 3, 5, 7, 9], target = 7
//				Output: [[-2, 1, 3, 5]]
//				Explanation:
//				nums[1] + nums[0] + nums[2] + nums[3] = 7

		int arr[] = { 1, -2, 3, 5, 7, 9 };
		int target = 7;
//		bruteForce
		List<Integer> res = solution(arr, target);
		System.out.println(res);

//		optimal
		List<List<Integer>> res1 = solution1(arr, target);
		System.out.println(res1);

	}

	private static List<List<Integer>> solution1(int[] arr, int target) {

		int n = arr.length;

		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (j > 0 && arr[j] == arr[j - 1]) {
					continue;
				}

				int left = j + 1;
				int right = n - 1;

				while (left < right) {

					int sum = arr[i] + arr[j] + arr[left] + arr[right];
					if (sum == target) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[left], arr[right]);
						list.add(temp);

						while (left < right && arr[left] == arr[left - 1]) {
							left++;
						}
						while (left < right && arr[right] == arr[right + 1]) {
							right--;
						}
						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}

		}

		return list;
	}

	private static List<Integer> solution(int[] arr, int target) {

		Set<List<Integer>> set = new HashSet<>();

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {

						if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
							List<Integer> data = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
							Collections.sort(data);
							set.add(data);
						}

					}
				}
			}
		}
		return new ArrayList(set);
	}
}
