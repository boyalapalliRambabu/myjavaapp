package com.kr.myjavaapp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 5, 3 };
		System.out.println(Arrays.toString(arr));

		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}
		// find mind
		int mid = ((low + high) / 2);
		// sort left half
		mergeSort(arr, low, mid);
		// sort right halt
		mergeSort(arr, mid + 1, high);

		// Merge two half
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int left = low, right = mid + 1;

		List<Integer> list = new ArrayList<>();

		// merge two arrays
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left++]);
			} else {
				list.add(arr[right++]);
			}
		}

		// add left elements
		while (left <= mid) {
			list.add(arr[left++]);
		}
		// add right element
		while (right <= high) {
			list.add(arr[right++]);
		}
		// copy to original array
		for (int i = low; i <= high; i++) {
			arr[i] = list.get(i - low);
		}
	}
}
