package com.kr.myjavaapp.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintTheMatrixInSpiralManner {

	public static void main(String[] args) {

//		        Input: matrix = [[1, 2, 3], [4 ,5 ,6], [7, 8, 9]]
//				Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
//				Explanation:
//				The elements in the spiral order are 1, 2, 3 -> 6, 9 -> 8, 7 -> 4, 5

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		List<Integer> data = solution(arr);
		System.out.println(data);
	}

	private static List<Integer> solution(int[][] arr) {
		List<Integer> data = new ArrayList<>();

		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr.length - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				data.add(arr[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				data.add(arr[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					data.add(arr[bottom][i]);
				}
				bottom--;
			}
			if (right < left) {

				for (int i = bottom; i >= top; i--) {

					data.add(arr[i][left]);
					left++;
				}
			}

		}

		return data;
	}
}
