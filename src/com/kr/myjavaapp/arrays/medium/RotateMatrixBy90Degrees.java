package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {
	public static void main(String[] args) {
//		Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
//		The rotation must be done in place, meaning the input 2D matrix must be modified directly.
//		Example 1
//		Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		bruteforece
		int res[][] = solution(arr);
		System.out.println(Arrays.deepToString(res));

//		ootimal
		System.out.println(Arrays.deepToString(arr));
		solution1(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	private static void solution1(int[][] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int left = 0, right = n - 1;
			while (left < right) {
				int tem = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = tem;
				left++;
				right--;
			}
		}
	}

	private static int[][] solution(int[][] arr) {

		int n = arr.length;

		int rotate[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotate[j][n - i - 1] = arr[i][j];
			}
		}
		return rotate;
	}

}
