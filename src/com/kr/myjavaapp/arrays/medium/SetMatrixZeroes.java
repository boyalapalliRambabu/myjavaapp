package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
//		Output: [[1,0,1],[0,0,0],[1,0,1]]

//		bruteforce
//		int res[][] = solution(matrix);
//		System.out.println(Arrays.deepToString(matrix));
//		better
		solution1(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}

	private static int[][] solution1(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] row = new boolean[m];
		boolean[] col = new boolean[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

	private static int[][] solution(int[][] matrix) {

//		rows
		int m = matrix.length;
//		col
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
//					mark all those row elements to -1 expect the 0

					for (int col = 0; col < n; col++) {
						if (matrix[i][col] != 0) {
							matrix[i][col] = -1;
						}
					}

//					mark all those col elements to -1 expect the 0
					for (int row = 0; row < m; row++) {
						if (matrix[row][j] != 0)
							matrix[row][j] = -1;
					}
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}

		return matrix;
	}

}
