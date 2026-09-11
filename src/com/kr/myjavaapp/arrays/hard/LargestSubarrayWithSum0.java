package com.kr.myjavaapp.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithSum0 {

	public static void main(String[] args) {
//		        Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]
//				Output: 5
//				Explanation:
//				The subarray [-2, 2, -8, 1, 7] sums up to 0 and has the maximum length among all such subarrays.
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int res = solution(arr);
		System.out.println(res);
	}

	private static int solution(int[] arr) {
		int maxSize = 0;

		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				maxSize = i + 1;
			} else {
				if (map.containsKey(sum)) {
					maxSize = Math.max(maxSize, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}

		}
		
		System.out.println(map);

		return maxSize;
	}
}
