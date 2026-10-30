package com.kr.myjavaapp.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String s1 = "flower";
		String s2 = "flow";

		System.out.println(s2.startsWith(s1));

		String[] str = { "flower", "flow", "flight" };

		String res = longestCommonPrefix(str);
		System.out.println(res);
	}

	private static String longestCommonPrefix(String[] str) {

		String prefix = str[0];

		for (int i = 1; i < str.length; i++) {

			while (!str[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

}
