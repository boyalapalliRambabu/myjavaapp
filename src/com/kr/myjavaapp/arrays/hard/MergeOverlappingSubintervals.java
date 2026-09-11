package com.kr.myjavaapp.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubintervals {

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		bruteforce
		List<List<Integer>> res = solution(intervals);

		System.out.println(res);

	}

	private static List<List<Integer>> solution(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<List<Integer>> res = new ArrayList<>();
		int i = 0;
		int n = intervals.length;
		while (i < n) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			int j = i + 1;
			while (j < n && intervals[j][0] <= end) {
				end = Math.max(end, intervals[j][1]);
				j++;
			}
			res.add(Arrays.asList(start, end));
			i = j;
		}
		return res;
	}

}
