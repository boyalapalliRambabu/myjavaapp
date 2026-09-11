package com.kr.myjavaapp.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorV1 {

	public static void main(String[] args) {
		
//		getName(null);

		List<Integer> list = List.of(1, 2, 3, 4, 5);

		Iterator<Integer> li = list.iterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

//		for(int l: list) {
//			list.remove(l);
//		}

		while (li.hasNext()) {
			li.remove();
		}
		System.out.println("----------");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}

	public static void getName(String name) {
		System.out.println("Name " + name);
	}

	public static void getName(Integer name) {
		System.out.println("Name " + name);
	}
}
