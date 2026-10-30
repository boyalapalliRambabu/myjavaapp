package com.kr.myjavaapp.linkedList;

public class SlMain {

	public static void main(String[] args) {
		SLinkedList sl = new SLinkedList();

		sl.insert(1);
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);

//		sl.display();
//
//		sl.inserFront(10);
//		sl.inserFront(20);
//		System.out.println("------");
//		sl.inserAtSpecificIndex(2, 103);
//		sl.display();
//		System.out.println("The size " + sl.size());
//
//		sl.delete(4);
		sl.display();
		sl.reverse();
		System.out.println("-----");
		sl.display();
	}
}
