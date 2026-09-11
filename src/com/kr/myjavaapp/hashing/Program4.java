package com.kr.myjavaapp.hashing;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int hash[] = new int[256];
		for (int i = 0; i < n.length(); i++) {
			hash[n.charAt(i)]++;
		}

		int p;
		p = sc.nextInt();
		while (p-- != 0) {
			char c;
			c = sc.next().charAt(0);
			System.out.println(hash[c]);
		}
	}

}
