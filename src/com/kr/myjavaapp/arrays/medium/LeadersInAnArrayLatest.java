package com.kr.myjavaapp.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeadersInAnArrayLatest {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 1, 2 };
//      brute force
		List<Integer> res = solution(arr);
		System.out.println(res);

//		  optimal
		List<Integer> res1 = solution1(arr);
		System.out.println(res1);
	}

	private static List<Integer> solution1(int[] arr) {
		List<Integer> leaders = new ArrayList<>();

		leaders.add(arr[arr.length - 1]);

		int max = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				leaders.add(arr[i]);
				max = arr[i];
			}
		}
		Collections.reverse(leaders);
		return leaders;

	}

	private static List<Integer> solution(int[] arr) {

		List<Integer> leaders = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			boolean leader = true;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					leader = false;
					break;
				}
			}
			if (leader) {
				leaders.add(arr[i]);
			}

		}

		return leaders;
	}

}
