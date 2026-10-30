package com.kr.myjavaapp.strings;

import java.util.Stack;

public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		String str = "((()))";

		String res1 = counterBaseApproch(str);
		System.out.println(res1);
		String res2 = stackBaseApproch(str);
		System.out.println(res2);
	}

	private static String stackBaseApproch(String str) {

		Stack<Character> stack = new Stack<>();
		StringBuilder res = new StringBuilder();

		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c == '(') {
				if (!stack.isEmpty()) {
					res.append(c);
				}
				stack.push(c);
			} else {
				stack.pop();
				if (!stack.isEmpty()) {
					res.append(c);
				}
			}

		}

		return res.toString();
	}

	private static String counterBaseApproch(String str) {

		int cnt = 0;

		StringBuilder res = new StringBuilder();

		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c == ')') {
				cnt--;
			}
			if (cnt != 0) {
				res.append(c);
			}
			if (c == '(') {
				cnt++;
			}
		}

		return res.toString();
	}
}
