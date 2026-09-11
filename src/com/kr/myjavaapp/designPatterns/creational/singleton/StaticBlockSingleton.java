package com.kr.myjavaapp.designPatterns.creational.singleton;

public class StaticBlockSingleton {
	// The single instance

	private static StaticBlockSingleton instance;

	// Private constructor to prevent instantiation
	private StaticBlockSingleton() {
	}

	// Static block for initialization
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Error occured while creating the single ton object");
		}
	}

	// Public method to get the instance 
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
