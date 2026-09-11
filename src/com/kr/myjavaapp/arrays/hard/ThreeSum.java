package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
//		        Input: nums = [2, -2, 0, 3, -3, 5]
//				Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
//				Explanation:
//				nums[1] + nums[2] + nums[0] = 0
//				nums[4] + nums[1] + nums[5] = 0
//				nums[4] + nums[2] + nums[3] = 0

		int arr[] = { 2, -2, 0, 3, -3, 5 };
//		bruteforce
		List<List<Integer>> list = solution(arr);
		System.out.println(list);
//		optimal
		List<List<Integer>> list1 = solution1(arr);
		System.out.println(list1);

	}

	private static List<List<Integer>> solution1(int[] arr) {

		int n = arr.length;

		Arrays.sort(arr);

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;
			int left = i + 1, right = n - 1;

			while (left < right) {

				int sum = arr[i] + arr[left] + arr[right];
				if (sum == 0) {
					list.add(Arrays.asList(arr[i], arr[left], arr[right]));
					left++;
					right--;

					while (left < right && arr[left] == arr[left - 1])
						left++;
					while (left < right && arr[right] == arr[right + 1])
						right++;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}

			}
		}

		return list;
	}

	private static List<List<Integer>> solution(int[] arr) {

		Set<List<Integer>> list = new HashSet<>();

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {

					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
						Collections.sort(temp);
						list.add(temp);
					}
				}
			}
		}
		return new ArrayList<>(list);
	}

}
