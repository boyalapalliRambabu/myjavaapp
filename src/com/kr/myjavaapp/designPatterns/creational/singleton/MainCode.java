package com.kr.myjavaapp.designPatterns.creational.singleton;

public class MainCode {

	public static void main(String[] args) {

		StaticBlockSingleton obj1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton obj2 = StaticBlockSingleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Both are the different objects");
		}

		ThreadSafeSingleton ts1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton ts2 = ThreadSafeSingleton.getInstance();

		if (ts1 == ts2) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Both are the different objects");
		}

		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		if (es1 == es2) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Both are the different objects");
		}

		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		if (ls1 == ls2) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Both are the different objects");
		}
		DoubleCheckedSingleton dcs1 = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton dcs2 = DoubleCheckedSingleton.getInstance();
		if (dcs1 == dcs2) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Both are the different objects");
		}
	}
}
