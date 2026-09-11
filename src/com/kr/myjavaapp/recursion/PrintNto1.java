package com.kr.myjavaapp.recursion;

public class PrintNto1 {

	public static void main(String[] args) {

		solutin(5);
	}

	private static void solutin(int i) {

		if (i < 1)
			return;
		System.out.println(i);
		solutin(i - 1);

	}

}
