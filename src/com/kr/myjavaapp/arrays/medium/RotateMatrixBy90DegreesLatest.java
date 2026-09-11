package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class RotateMatrixBy90DegreesLatest {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(arr));
//		bruteforece
//		int res[][] = solution(arr);
//		System.out.println(Arrays.deepToString(res));

//		optimal
		solution1(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	private static void solution1(int[][] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				swap(arr, i, j);
			}
		}

		for (int i = 0; i < n; i++) {
			int left = 0, right = n - 1;
			while (left < right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++;
				right--;
			}

		}
	}

	private static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}

	private static int[][] solution(int[][] arr) {
		int n = arr.length;
		int res[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[j][n - i - 1] = arr[i][j];
			}
		}
		return res;
	}
}
