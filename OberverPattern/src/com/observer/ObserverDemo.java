package com.observer;

import java.util.Scanner;

public class ObserverDemo {
	public static void main(String[] args) {
		Subject sub = new Subject();
		// Client configures the number and type of Observers
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}
	}
}
