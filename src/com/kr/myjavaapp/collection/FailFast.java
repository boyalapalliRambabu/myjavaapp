package com.kr.myjavaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));
		for (String s : list) {
			if (s.equals("C")) {
				list.remove(s);
			}
		}
		System.out.println(list);

//		Iterator<String> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			if (itr.hasNext() && itr.next().equals("B")) {
//				itr.remove();
//			}
//		}
//		System.out.println(list);
//
//		list.removeIf(s -> s.equals("C"));
//		System.out.println(list);

	}
}
