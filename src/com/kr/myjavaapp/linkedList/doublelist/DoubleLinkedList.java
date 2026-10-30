package com.kr.myjavaapp.linkedList.doublelist;

import java.util.NoSuchElementException;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private int size;

	// 1. insert at the end
	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void insertFront(int data) {
		Node newNew = new Node(data);

		if (head == null) {
			head = tail = newNew;
		} else {
			newNew.next = head;
			head.prev = newNew;
			head = newNew;
		}
		size++;
	}

	public void displayForword() {
		Node current = head;

		while (current != null) {
			System.out.println(current.data + " ->");
			current = current.next;
		}
		System.out.println("null");
	}

	// 5. Display from tail to head
	public void displayBackward() {
		Node current = tail;

		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.prev;
		}

		System.out.println("null");
	}

	public void insertAt(int index, int data) {
		checkElementIndex(index);
		if (index == 0) {
			insert(data);
			return;
		}

		if (index == size) {
			insertFront(data);
			return;
		}

		Node current = getNode(index);
		Node pre = current.prev;
		Node newNode = new Node(data);

		newNode.prev = pre;
		newNode.next = current;
		pre.next = newNode;
		current.prev = newNode;

		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Internal helper: retrieve the node at a valid index

	public Node getNode(int index) {

		if (index < size / 2) {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current;
		} else {
			Node current = tail;
			for (int i = size - 1; i > index; i--) {
				current = current.prev;
			}
			return current;
		}
	}

	public boolean delete(int data) {

		Node current = head;

		while (current != null && current.data != data) {
			current = current.next;
		}
		if (current == null) {
			return false;
		}

		unlink(current);

		return true;

	}

	// 7. Delete the first node
	public boolean deleteFirst() {
		if (head == null) {
			return false;
		}

		unlink(head);
		return true;
	}

	// 8. Delete the last node
	public boolean deleteLast() {
		if (tail == null) {
			return false;
		}

		unlink(tail);
		return true;
	}

	private void unlink(Node node) {
		Node prev = node.prev;
		Node next = node.next;

		if (prev == null) {
			head = next;
		} else {
			prev.next = next;
		}

		if (next == null) {
			tail = prev;
		} else {
			next.prev = prev;
		}

		node.prev = null;
		node.next = null;
		size--;
	}

	// 9. Get the first value
	public int getFirst() {
		if (head == null) {
			throw new NoSuchElementException("List is empty");
		}

		return head.data;
	}

	public int getLast() {
		if (tail == null) {
			throw new NoSuchElementException("List is empty");
		}

		return tail.data;
	}

	// 11. Get the value at an index
	public int get(int index) {
		return getNode(index).data;
	}

	// 12. Update the value at an index
	public void set(int index, int value) {
		getNode(index).data = value;
	}

	// 13. Check whether a value exists
	public boolean contains(int value) {
		Node current = head;

		while (current != null) {
			if (current.data == value) {
				return true;
			}

			current = current.next;
		}

		return false;
	}

	// 14. Find the first index of a value
	public int indexOf(int value) {
		Node current = head;
		int index = 0;

		while (current != null) {
			if (current.data == value) {
				return index;
			}

			current = current.next;
			index++;
		}

		return -1;
	}

	public int[] toArray() {
		int[] result = new int[size];
		Node current = head;

		for (int i = 0; i < size; i++) {
			result[i] = current.data;
			current = current.next;
		}

		return result;
	}

	// 16. Remove all nodes from the list
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public void reverse() {
		Node current = head;

		while (current != null) {
			// Save the original previous node.
			Node temp = current.prev;

			// Swap the previous and next references.
			current.prev = current.next;
			current.next = temp;

			// Move to the next node in the original list.
			current = current.prev;
		}

		// Swap head and tail.
		Node temp = head;
		head = tail;
		tail = temp;
	}

	// Used by insertion: index == size is allowed.
	private void checkPositionIndex(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	}

	// Used by get/set: index must refer to an existing node.
	private void checkElementIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	}

}
