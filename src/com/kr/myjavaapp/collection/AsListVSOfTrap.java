package com.kr.myjavaapp.collection;

import java.util.Arrays;
import java.util.List;

public class AsListVSOfTrap {

	public static void main(String[] args) {

		// Fixed in size also mutable
		List<String> list = Arrays.asList("A", "B", "C");
		System.out.println(list);
		list.set(0, "Z");
		System.out.println(list);
//		list.add("Z");
//		list.remove("C");

		// Also shares backing array with original:
		String[] arr = { "x", "y", "z" };
		List<String> view = Arrays.asList(arr);
		arr[0] = "CHANGED";
		System.out.println(view.get(0)); // prints "CHANGED" — it's a live view!

		List<String> newList = List.of("A", "B", "C", "D");

		newList.add("Z");
		newList.set(2, "ADS");
		newList.add(null);

	}
}
