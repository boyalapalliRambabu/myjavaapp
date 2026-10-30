
package com.kr.myjavaapp.linkedList;

import java.util.NoSuchElementException;

public class SingleLinkedList {

	private Node head = null;
	private Node tail = null;
	private int size;

	// 1. Insert at the end
	public void insert(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	// 2. Insert at the beginning
	public void insertAtFront(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

		size++;
	}

	// 3. Insert at a specific index
	public void insertAt(int index, int val) {
		checkPositionIndex(index);

		if (index == 0) {
			insertAtFront(val);
			return;
		}

		if (index == size) {
			insert(val);
			return;
		}

		Node newNode = new Node(val);
		Node temp = head;

		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}

	// 4. Display the list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	// 5. Delete the first occurrence of a value
	public boolean delete(int value) {
		if (head == null) {
			return false;
		}

		if (head.data == value) {
			head = head.next;

			if (head == null) {
				tail = null;
			}

			size--;
			return true;
		}

		Node temp = head;

		while (temp.next != null && temp.next.data != value) {
			temp = temp.next;
		}

		if (temp.next == null) {
			return false;
		}

		if (temp.next == tail) {
			tail = temp;
		}

		temp.next = temp.next.next;
		size--;

		return true;
	}

	// 6. Delete the first node
	public boolean deleteFirst() {
		if (head == null) {
			return false;
		}

		head = head.next;
		size--;

		if (head == null) {
			tail = null;
		}

		return true;
	}

	// 7. Delete the last node
	public boolean deleteLast() {
		if (head == null) {
			return false;
		}

		if (head == tail) {
			head = tail = null;
			size--;
			return true;
		}

		Node temp = head;

		while (temp.next != tail) {
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		size--;

		return true;
	}

	// 8. Get the first value
	public int getFirst() {
		if (head == null) {
			throw new NoSuchElementException("List is empty");
		}

		return head.data;
	}

	// 9. Get the last value
	public int getLast() {
		if (tail == null) {
			throw new NoSuchElementException("List is empty");
		}

		return tail.data;
	}

	// 10. Get a value by index
	public int get(int index) {
		checkElementIndex(index);

		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	// 11. Update a value by index
	public void set(int index, int value) {
		checkElementIndex(index);

		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		temp.data = value;
	}

	// 12. Search for a value
	public boolean contains(int value) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == value) {
				return true;
			}

			temp = temp.next;
		}

		return false;
	}

	// 13. Find the index of the first occurrence
	public int indexOf(int value) {
		Node temp = head;
		int index = 0;

		while (temp != null) {
			if (temp.data == value) {
				return index;
			}

			temp = temp.next;
			index++;
		}

		return -1;
	}

	// 14. Remove all nodes
	public void clear() {
		head = tail = null;
		size = 0;
	}

	// 15. Check whether the list is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// 16. Get the number of nodes
	public int getSize() {
		return size;
	}

	// 17. Convert the list into an array
	public int[] toArray() {
		int[] result = new int[size];
		Node temp = head;

		for (int i = 0; i < size; i++) {
			result[i] = temp.data;
			temp = temp.next;
		}

		return result;
	}

	// Validate an index used to access an existing node
	private void checkElementIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}

	// Validate an index used to insert a node
	private void checkPositionIndex(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}
}
