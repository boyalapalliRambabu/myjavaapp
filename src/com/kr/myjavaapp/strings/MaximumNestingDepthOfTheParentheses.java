package com.kr.myjavaapp.strings;

public class MaximumNestingDepthOfTheParentheses {

	public static void main(String[] args) {

		String str = "(1+(2*3)+((8)/4))+1";
		int res = solution(str);
		System.out.println(res);
	}

	private static int solution(String str) {

		int cnt = 0, res = 0;

		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (c == '(') {
				cnt++;
				res = Math.max(cnt, res);
			} else if (c == ')') {
				cnt--;
			}

		}

		return res;
	}
}
