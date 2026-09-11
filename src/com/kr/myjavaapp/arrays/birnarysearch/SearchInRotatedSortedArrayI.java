package com.kr.myjavaapp.arrays.birnarysearch;

public class SearchInRotatedSortedArrayI {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int res = soulution(nums, target);
		System.out.println(res);
		int res1 = soulution1(nums, target);
		System.out.println(res1);
	}

	private static int soulution1(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		return -1;
	}

	private static int soulution(int[] nums, int target) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			if (nums[low] <= nums[mid]) {
				if (target >= nums[low] && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target >= nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

}
