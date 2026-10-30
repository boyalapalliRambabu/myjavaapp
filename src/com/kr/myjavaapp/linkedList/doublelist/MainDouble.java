package com.kr.myjavaapp.linkedList.doublelist;

public class MainDouble {
	public static void main(String[] args) {

		DoubleLinkedList dl = new DoubleLinkedList();

		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.displayForword();
		System.out.println("--------");
		dl.insertFront(2);
		dl.displayForword();
		dl.insertAt(3,8);
		System.out.println("---------");
		dl.displayForword();
	}
}
