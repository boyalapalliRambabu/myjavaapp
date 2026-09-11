package com.kr.myjavaapp.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WhyLinkedListIsSlowForFetching {

	public static void main(String[] args) {

//		List<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


		long start1 = System.nanoTime();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		long end1 = System.nanoTime();

		System.err.println("Completed");
		long start2 = System.nanoTime();
		for (int data : list) {
			System.out.println(data);
		}
		long end2 = System.nanoTime();
		System.out.println("Latency " + (end1 - start1) + " ns");
		System.out.println("Latency " + (end2 - start2) + " ns");
	}

}
