package com.kr.myjavaapp.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedInArrays {
	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 4, 5 }, nums2[] = { 1, 2, 7 };
//		int[] res = solution(nums1, nums2);
//		System.out.println(Arrays.toString(res1));

		List<Integer> res1 = solution1(nums1, nums2);
		System.out.println(res1);
	}

	private static List<Integer> solution1(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] <= nums2[j]) {
				if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
					list.add(nums1[i]);
				}
				i++;
			} else if (nums2[j] <= nums1[i]) {
				if (list.size() == 0 || list.get(list.size() - 1) != nums2[j]) {
					list.add(nums2[j]);
				}
				j++;
			} else {
				if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
					list.add(nums1[i]);
					i++;
					j++;
				}
			}
		}

		while (i < nums1.length) {
			if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
				list.add(nums1[i]);
			}
			i++;
		}
		while (j < nums2.length) {
			if (list.size() == 0 || list.get(list.size() - 1) != nums2[j]) {
				list.add(nums2[j]);
			}
			j++;
		}
		return list;
	}

	private static int[] solution(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet();

		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			set.add(nums2[i]);
		}
		System.out.println(set);
		int[] union = new int[set.size()];

		int i = 0;
		for (int val : set) {
			System.out.println("val " + val);
			union[i] = val;
			i = i + 1;
		}

		return union;
	}

}
