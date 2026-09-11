package com.kr.myjavaapp.linkedList;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable {

	transient int size = 0;
	transient Node<E> first; // Header pointer
	transient Node<E> last;// Tail pointer

	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;
	}

	public E get(int index) {
		checkElementIndex(index);
		return node(index).item;
	}

	Node<E> node(int index) {

		if (index < (size >> 1)) {
			Node<E> x = first;
			for (int i = 0; i < index; i++) {
				x = x.next;

			}

			return x;
		} else {
			Node<E> x = last;
			for (int i = size - 1; i > index; i--) {
				x = x.next;
			}
			return x;
		}
	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
