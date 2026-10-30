package com.kr.myjavaapp.linkedList;

import java.util.NoSuchElementException;

public class SLinkedList {

	private Node head;
	private Node tail;
	private int size;

//	at the end
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void inserFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public void inserAtSpecificIndex(int index, int data) {
		checkPositionOfIndex(index);

		if (index == 0) {
			inserFront(data);
			return;
		}
		if (index == size) {
			insert(data);
			return;
		}

		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}

	public boolean delete(int val) {

		if (head == null) {
			return false;
		}

		if (head.data == val) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
			return true;

		}

		Node temp = head;

		while (temp.next != null && temp.next.data != val) {
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

	public boolean deleteFirst() {
		if (head == null) {
			return false;
		}
		head = head.next;

		if (head == null) {
			tail = null;
		}
		size--;
		return true;

	}

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

	public int get(int index) {
		checkElementIndex(index);

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	public void set(int index, int val) {
		checkElementIndex(index);
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.data = val;
	}

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

	public int indexOf(int val) {

		Node temp = head;

		int index = 0;

		while (temp != null) {

			if (temp.data == val) {
				return index;
			}

			index++;
			temp = temp.next;
		}

		return -1;
	}

	// 17. Convert the list into an array
	public int[] toArray() {
		int result[] = new int[size];
		Node temp = head;
		for (int i = 0; i < size; i++) {
			result[i] = temp.data;
			temp = temp.next;
		}
		return result;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	private void checkPositionOfIndex(int index) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException("Index :" + index + " size :" + size);
		}
	}

	private void checkElementIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	}

	public int size() {
		return size;
	}

	public void reverse() {

		Node prev = null;
		Node current = head;

		tail = head;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
}
