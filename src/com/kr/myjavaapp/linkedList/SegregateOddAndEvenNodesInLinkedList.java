package com.kr.myjavaapp.linkedList;

import java.util.ArrayList;
import java.util.List;

public class SegregateOddAndEvenNodesInLinkedList {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5, 6 };
		Node head = buildList(values);

		Node answer = segregateOptimal(head);

		printList(answer);
	}

	private static Node segregateOptimal(Node head) {

		Node evenDummy = new Node(0);
		Node evenTail = evenDummy;
		Node oddDummy = new Node(0);

		Node oddTail = oddDummy;

		Node current = head;

		while (current != null) {
			Node next = current.next;
			current.next = null;

			if (current.data % 2 == 0) {
				evenTail.next = current;
				evenTail = current;
			} else {
				oddTail.next = current;
				oddTail = current;
			}
			current = next;
		}

		evenTail.next = oddDummy.next;

		if (evenDummy.next != null) {
			return evenDummy.next;
		}
		return oddDummy.next;
	}

	private static Node segregate(Node head) {

		List<Integer> evenNo = new ArrayList<>();
		List<Integer> oddNo = new ArrayList<>();

		Node current = head;

		while (current != null) {
			if (current.data % 2 == 0) {
				evenNo.add(current.data);
			} else {
				oddNo.add(current.data);
			}
			current = current.next;
		}

		current = head;
		for (int even : evenNo) {
			current.data = even;
			current = current.next;

		}

		for (int odd : oddNo) {
			current.data = odd;
			current = current.next;
		}

		return head;
	}

	private static void printList(Node head) {

		while (head != null) {

			System.out.print(head.data);
			if (head.next != null) {
				System.out.print(" ");
			}
			head = head.next;
		}
	}

	private static Node buildList(int[] values) {

		Node dummy = new Node(0);
		Node tail = dummy;
		for (int val : values) {
			tail.next = new Node(val);
			tail = tail.next;
		}

		return dummy.next;
	}

}
