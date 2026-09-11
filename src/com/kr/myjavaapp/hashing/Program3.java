package com.kr.myjavaapp.hashing;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		name = sc.next();
		int hash[] = new int[26];
		for (int i = 0; i < name.length(); i++) {
			hash[name.charAt(i) - 'a']++;
		}

		int p;
		p = sc.nextInt();
		while (p-- != 0) {
			char c;
			c = sc.next().charAt(0);
			System.out.println(hash[c - 'a']);
		}

	}
}
