package com.kr.myjavaapp.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HighestOccurringElementInAnArray {

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2, 3, 3, 3 };
		int arr[] = { 4, 4, 5, 5, 6 };
		System.out.println(mostFrequentElement(arr));
		System.out.println(getFrequentElement(arr));
	}

//	bruteForce
	public static int getFrequentElement(int[] nums) {

		int maxFreq = 0;
		int MaxVal = 0;
		boolean visit[] = new boolean[nums.length];

		for (int i = 0; i < nums.length; i++) {

			if (visit[i])
				continue;
			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

				if (count > maxFreq) {
					maxFreq = count;
					MaxVal = nums[i];
				}
			}
		}
		return MaxVal;
	}

	public static int mostFrequentElement(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int maxCount = 0;
		int maxValue = 0;

		for (Entry<Integer, Integer> data : map.entrySet()) {
			if (data.getValue() > maxCount) {
				maxValue = data.getKey();
				maxCount = data.getValue();
			} else if (data.getValue() == maxCount) {
				maxValue = Math.min(maxValue, data.getKey());
			}

		}

		return maxValue;
	}
}
