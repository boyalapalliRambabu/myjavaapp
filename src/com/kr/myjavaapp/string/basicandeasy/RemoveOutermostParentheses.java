package com.kr.myjavaapp.string.basicandeasy;

public class RemoveOutermostParentheses {
	public static void main(String[] args) {
//		        Input: s = "((()))"
//				Output: "(())"
//				Explanation:
//				The input string is a single primitive: "((()))".
//				Removing the outermost layer yields: "(())".

		String input = "((()))";
		String res = solution(input);
		System.out.println(res);
	}

	private static String solution(String input) {

		StringBuilder res = new StringBuilder();
		int count = 0;
		for (char c : input.toCharArray()) {

			if (c == '(') {
				if (count > 0) {
					res.append(c);
				}
				count++;
			} else if (c == ')') {

				count--;
				if (count > 0) {
					res.append(c);
				}
			}
		}
		return res.toString();
	}
}
