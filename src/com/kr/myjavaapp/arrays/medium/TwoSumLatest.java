package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumLatest {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 2, 10, 3 };
		int target = 7;
//		bruteforce
		int res[] = solution(arr, target);
		System.out.println(Arrays.toString(res));
//		better
		int res1[] = solution1(arr, target);
		System.out.println(Arrays.toString(res1));

////		optimal
//		boolean res2 = solution2(arr, target);
//		System.out.println(res2);

//		optimal
		int res2[] = solution2(arr, target);
		System.out.println(Arrays.toString(res1));
	}

	private static boolean solution3(int[] arr, int target) {

		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		System.out.println(Arrays.toString(arr));

		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				return true;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}

	private static int[] solution2(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int indexArr[][] = new int[arr.length][2];
		for (int i = 0; i < arr.length; i++) {
			indexArr[i][0] = arr[i];
			indexArr[i][1] = i;
		}

		Arrays.sort(indexArr, (a, b) -> Integer.compare(a[0], b[0]));

		while (left < right) {
			int sum = indexArr[left][0] + indexArr[right][0];
			if (sum == target) {
				return new int[] { indexArr[left][1], indexArr[right][1] };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] { -1, -1 };
	}

	private static int[] solution1(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			int value = target - arr[i];
			if (map.containsKey(value)) {
				return new int[] { i, map.get(value) };
			}
			map.put(arr[i], i);
		}
		return new int[] { -1, -1 };
	}

	private static int[] solution(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };

	}
}
