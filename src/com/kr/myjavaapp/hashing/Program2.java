package com.kr.myjavaapp.hashing;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		precompute
		int hash[] = new int[13];
		for (int j = 0; j < n; j++) {
			hash[arr[j]] += 1;
		}
		int q;
		q = sc.nextInt();
		while (q-- != 0) {
			int num;
			num = sc.nextInt();
			// Fetch
			System.out.println(hash[num]);
		}
	}

}
