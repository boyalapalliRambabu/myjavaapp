package com.kr.myjavaapp.hashing;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 2 };
		int que[] = { 1, 3, 4, 2, 10 };
		for (int i = 0; i < que.length; i++) {
			int count = countFreq(arr[i], arr);
			System.out.println("Value " + arr[i] + "Freq " + count);
		}
	}

	private static int countFreq(int i, int[] arr) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				count++;
			}
		}
		return count;
	}
}
