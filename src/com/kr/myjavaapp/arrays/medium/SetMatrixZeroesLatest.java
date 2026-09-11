package com.kr.myjavaapp.arrays.medium;

import java.util.Arrays;

public class SetMatrixZeroesLatest {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		System.out.println(Arrays.deepToString(matrix));
		// burteforce
//		solution(matrix);
//		System.out.println(Arrays.deepToString(matrix));

//		better
		solution1(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}

	private static void solution1(int[][] matrix) {

		int row[] = new int[matrix.length];
		int col[] = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}

			}
		}

	}

	private static void solution(int[][] matrix) {

		int row = matrix.length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					marksRows(i, matrix);
					markColoums(j, matrix);
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}

	}

	private static void markColoums(int j, int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {

			if (matrix[row][j] != 0) {
				matrix[row][j] = -1;
			}
		}
	}

	private static void marksRows(int i, int[][] matrix) {

		for (int col = 0; col < matrix[i].length; col++) {
			if (matrix[i][col] != 0) {
				matrix[i][col] = -1;
			}

		}

	}

}
