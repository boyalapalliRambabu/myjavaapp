package com.kr.myjavaapp.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MoveZerosToEndInArray {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 4, 0, 5, 2 };
//		bruteforce
//		solution(arr);
//		System.out.println(Arrays.toString(arr));
//		optimal
		solution1(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution1(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
			}
		}

	}

	private static void solution(int[] arr) {

		List<Integer> list = new LinkedList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			}
		}
		int i = 0;
		for (int val : list) {
			arr[i++] = val;
		}

		for (int j = list.size(); j < arr.length; j++) {
			arr[j] = 0;
		}
	}
}
