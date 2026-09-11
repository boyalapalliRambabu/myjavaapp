package com.kr.myjavaapp.arrays.easy;

import java.util.Arrays;

public class LeftRotateTheArrayByOne {

	public static void main(String[] args) {
//		    Input:
//			 nums = [1, 2, 3, 4, 5]  
//			Output:
//			 [2, 3, 4, 5, 1]  

		int arr[] = { 1, 2, 3, 4, 5 };
		solution(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr) {
		int k = arr[0];
		for (int j = 1; j < arr.length; j++) {
			arr[j - 1] = arr[j];
		}
		arr[arr.length - 1] = k;
	}

}
