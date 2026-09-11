package com.kr.myjavaapp.arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
//		Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
//	    Output: [1, 2, 3, 4, 5, 7]
		int nums1[] = { 1, 2, 3, 4, 5 }, nums2[] = { 1, 2, 7 };
		List<Integer> res1 = byUsingMap(nums1, nums2);
		System.out.println(res1);

		List<Integer> res2 = byUsingSet(nums1, nums2);
		System.out.println(res1);
	}

	private static List<Integer> byUsingSet(int[] nums1, int[] nums2) {
		Set<Integer> set = new TreeSet<>();
		for (int val : nums1) {
			set.add(val);
		}
		for (int val : nums2) {
			set.add(val);
		}
		return new ArrayList<>(set);
	}

	private static List<Integer> byUsingMap(int[] nums1, int[] nums2) {
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}
		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
		}

		List<Integer> union = new ArrayList<>();
    
		for (int val : map.keySet()) {
			union.add(val);
		}
		return union;
	}
}
