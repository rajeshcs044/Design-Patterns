package com.singleton;

public class SingletonConsumer {
	public static void main(String[] arg) {
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
}
