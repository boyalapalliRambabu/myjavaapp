package com.kr.myjavaapp.linkedList;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersInLinkedListsWithDigitsinReverseOrder {

	public static void main(String[] args) {
		int[] first = { 9, 9, 9 };
		int[] second = { 1 };

		Node l1 = buildList(first);
		print(l1);
		Node l2 = buildList(second);
		print(l2);
		Node res = addTwoListOptimal(l1, l2);

		System.out.println("Response");
		print(res);
	}

	private static Node addTwoList(Node l1, Node l2) {

		List<Integer> firstDigit = new ArrayList<>();
		List<Integer> secondDigit = new ArrayList<>();

		while (l1 != null) {
			firstDigit.add(l1.data);
			l1 = l1.next;
		}

		while (l2 != null) {
			secondDigit.add(l2.data);
			l2 = l2.next;
		}

		Node dummy = new Node(0);

		Node tail = dummy;

		int i = 0, j = 0;

		int carry = 0;

		while (i < firstDigit.size() || j < secondDigit.size() || carry > 0) {
			int sum = carry;

			if (i < firstDigit.size()) {
				sum += firstDigit.get(i);
				i++;
			}
			if (j < secondDigit.size()) {
				sum += secondDigit.get(j);
				j++;
			}

			int digit = sum % 10;
			carry = sum / 10;
			tail.next = new Node(digit);
			tail = tail.next;

		}
		return dummy.next;
	}

	private static Node addTwoListOptimal(Node l1, Node l2) {

		Node dummy = new Node(0);

		Node tail = dummy;

		int carry = 0;

		while (l1 != null || l2 != null || carry > 0) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.data;
				l1 = l1.next;

			}
			if (l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}

			int digit = sum % 10;
			carry = sum / 10;
			tail.next = new Node(digit);
			tail = tail.next;

		}
		return dummy.next;
	}

	public static void print(Node node) {

		while (node != null) {
			System.out.print(node.data);
			if (node.next != null) {
				System.out.print(" ");
			}
			node = node.next;
		}
		System.out.println();
	}

	private static Node buildList(int[] data) {

		Node dummy = new Node(0);
		Node tail = dummy;
		for (int val : data) {
			tail.next = new Node(val);
			tail = tail.next;
		}
		return dummy.next;
	}

}
