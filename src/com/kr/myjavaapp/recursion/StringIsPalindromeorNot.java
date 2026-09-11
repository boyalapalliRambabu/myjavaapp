package com.kr.myjavaapp.recursion;

public class StringIsPalindromeorNot {
	public static void main(String[] args) {

		String str = "hannah";
		System.out.println(palindromeCheck(str));
		System.out.println(getPalindromeCheck(0, str));
	}

	public static boolean getPalindromeCheck(int i, String s) {

		if (i >= s.length() / 2)
			return true;
		if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
			return false;
		}
		return getPalindromeCheck(i + 1, s);
	}

	public static boolean palindromeCheck(String s) {
		char[] str = s.toCharArray();
		int left = 0;
		int right = str.length - 1;
//		while (left < right) {
//			char c = str[left];
//			str[left] = str[right];
//			str[right] = c;
//			left++;
//			right--;
//		}
//		return new String(str).equals(s);
		while (left < right) {
			char c = str[left];
			if (str[left] != str[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
