package com.kr.myjavaapp.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int j = 0; j < n; j++) {

			int key = arr[j];
			int freq = 0;
			if (map.containsKey(key))
				freq = map.get(key);
			freq++;
			map.put(key, freq);
		}

		int p;
		p = sc.nextInt();

		while (p-- != 0) {
			int v;
			v = sc.nextInt();
			if (map.containsKey(v)) {
				System.out.println(map.get(v));
			} else {
				System.out.println("0");
			}
		}
	}

}
