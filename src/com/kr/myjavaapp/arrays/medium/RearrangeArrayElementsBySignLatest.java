package com.kr.myjavaapp.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySignLatest {
	public static void main(String[] args) {
//		equal number of positive and negative elements
//		int arr[] = { 2, 4, 5, -1, -3, -4 };
//		brute force
//		int res[] = solution(arr);
//		System.out.println(Arrays.toString(res));

//		optimal
//		int res1[] = solution1(arr);
//		System.out.println(Arrays.toString(res1));

//		unequal number of positive and negative elements
//		int arr[] = { 1, 2, 3, 8, -4, -5 };
//		int res2[] = solution2(arr);
//		System.out.println(Arrays.toString(res2));

//		int arr[] = { 1, 2, 3, 8, -4, -5 };
//		int res3[] = solution3(arr);
//		System.out.println(Arrays.toString(res3));

	}

//	private static int[] solution3(int[] arr) {
//
//		int temp[] = new int[arr.length];
//
//		int pv = 0, nv = 1;
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] < 0) {
//				if (nv < arr.length) {
//					temp[nv] = arr[i];
//					nv += 2;
//				}
//			} else {
//				if (pv < arr.length) {
//					temp[pv] = arr[i];
//					pv += 2;
//				}
//			}
//		}
//
//		System.out.println(nv);
//		System.out.println(pv);
//
//		return temp;
//	}

	private static int[] solution2(int[] arr) {
		List<Integer> pv = new ArrayList<>();
		List<Integer> nv = new ArrayList<>();

		for (int val : arr) {
			if (val < 0) {
				nv.add(val);
			} else {
				pv.add(val);
			}
		}
		int i = 0;
		for (; i < Math.min(pv.size(), nv.size()); i++) {
			arr[i * 2] = pv.get(i);
			arr[i * 2 + 1] = nv.get(i);
		}
		int index = i * 2;
		if (pv.size() > nv.size()) {
			while (i < pv.size()) {
				arr[index++] = pv.get(i++);
			}
		} else {
			while (i < nv.size()) {
				arr[index++] = nv.get(i++);
			}
		}
		return arr;
	}

	private static int[] solution1(int[] arr) {
		int[] temp = new int[arr.length];

		int pos = 0, neg = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[neg] = arr[i];
				neg += 2;
			} else {
				temp[pos] = arr[i];
				pos += 2;
			}
		}
		return temp;
	}

	private static int[] solution(int[] arr) {
		List<Integer> pv = new ArrayList<>();
		List<Integer> nv = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				nv.add(arr[i]);
			} else {
				pv.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i * 2] = pv.get(i++);
			arr[i * 2 + 1] = nv.get(i++);
		}

		return arr;
	}

}
