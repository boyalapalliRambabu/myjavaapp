package com.kr.myjavaapp.arrays.hard;

public class PascalTriangleLatest {

	public static void main(String[] args) {
		int r = 4, c = 2;
//				Output: 3
		int res = solution(r - 1, c - 1);
		System.out.println(res);
	}

	private static int solution(int r, int c) {
		int ans = 1;
		for (int i = 0; i < c; i++) {
			ans = ans * (r - i);
			ans =ans/ (i + 1);
		}
		return ans;
	}

}
