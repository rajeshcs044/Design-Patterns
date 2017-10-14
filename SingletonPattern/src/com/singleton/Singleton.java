package com.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("Object created for the first time");
			singleton = new Singleton();
			return singleton;
		}
		System.out.println("Object already created");
		return singleton;
	}
}
