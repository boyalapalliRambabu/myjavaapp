package com.kr.myjavaapp.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

	public static void main(String[] args) {
//		Input: nums = [1, 2, 5, 3, 1, 2]
//		Output: [5, 3, 2]
//		Explanation:2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

		int arr[] = { 1, 2, 5, 3, 1, 2 };
//      brute force
		List<Integer> res = solution(arr);
		System.out.println(res);

		List<Integer> res1 = solution1(arr);
		System.out.println(res1);
	}

	private static List<Integer> solution1(int[] arr) {
		List<Integer> res = new ArrayList<>();

		if (arr.length == 0) {
			return res;
		}
		res.add(arr[arr.length - 1]);
		int max = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				res.add(arr[i]);
			}
		}

		Collections.reverse(res);
		return res;
	}

	private static List<Integer> solution(int[] arr) {
		List<Integer> leader = new ArrayList<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				leader.add(arr[i]);
			}
		}
		return leader;
	}
}
