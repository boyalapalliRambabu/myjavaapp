package com.kr.myjavaapp.linkedList;

public class SingleMain {

	public static void main(String[] args) {

		SingleLinkedList sList = new SingleLinkedList();

		sList.insert(10);
		sList.insert(30);
		sList.insert(40);
		sList.insert(50);

//		sList.dispaly();
		System.out.println("--------------------");
		sList.delete(30);
		sList.insertAtFront(90);
//		sList.dispaly();

	}
}
