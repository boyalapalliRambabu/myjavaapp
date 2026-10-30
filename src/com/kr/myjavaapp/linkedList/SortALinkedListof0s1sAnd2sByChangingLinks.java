package com.kr.myjavaapp.linkedList;

import java.util.Arrays;

public class SortALinkedListof0s1sAnd2sByChangingLinks {

	// Driver code.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 1, 2, 1, 0, 0, 1, 0 };

		int freq[] = { 0, 0, 0 };

		for (int val : arr) {
			freq[val]++;
		}

		System.out.println(Arrays.toString(freq));

		Node head = buildList(arr);

		head = sortList(head);

		printList(head);
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

	private static Node sortList(Node head) {
		// Return the same head for empty or single-node lists.
		if (head == null || head.next == null) {
			return head;
		}

		int[] count = { 0, 0, 0 };

		Node current = head;

		while (current != null) {
			count[current.data]++;
			current = current.next;
		}

		current = head;
		int value = 0;

		// Rewrite node values in sorted order.
		while (current != null) {
			// Skip values whose frequency is already exhausted.
			while (value < 3 && count[value] == 0) {
				value++;
			}

			// Place the current sorted value into the node.
			current.data = value;

			// Consume one occurrence of the placed value.
			count[value]--;
			current = current.next;
		}

		return head;
	}

	private static Node buildList(int[] arr) {

		if (arr.length == 0) {
			return null;
		}

		Node dummy = new Node(0);
		Node tail = dummy;

		for (int val : arr) {
			tail.next = new Node(val);
			tail = tail.next;
		}
		return dummy.next;
	}
}
