package com.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("Object created for the first time");
			return new Singleton();
		}
		System.out.println("Object already created");
		return singleton;
	}
}
