package com.kr.myjavaapp.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCount {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 1, 3 };
		System.out.println(countFrequencies(arr));
		frequency(arr);
	}

	public static void frequency(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}

		for (Entry<Integer, Integer> data : map.entrySet()) {
			System.out.println("Key " + data.getKey() + " Value " + data.getValue());
		}
	}

	public static List<List<Integer>> countFrequencies(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();

		boolean visited[] = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {

			if (visited[i])
				continue;
			List<Integer> data = new ArrayList<>();
			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					visited[j] = true;
					count = count + 1;
				}

			}
			data.add(nums[i]);
			data.add(count);
			list.add(data);
		}

		return list;
	}

}
