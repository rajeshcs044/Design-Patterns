package com.factory.consumers;

import com.factory.Operation;

public class OperationFactoryDemo {
	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		OperationFactory operationFactory = new OperationFactory();
		Operation operation = operationFactory.doOperation("Addition");
		System.out.println("The result is: " + (operation == null ? 0 : operation.getResult(a, b)));
		operation = operationFactory.doOperation("Subtraction");
		System.out.println("The result is: " + (operation == null ? 0 : operation.getResult(a, b)));
		operation = operationFactory.doOperation("Multiplication");
		System.out.println("The result is: " + (operation == null ? 0 : operation.getResult(a, b)));
		operation = operationFactory.doOperation("Division");
		System.out.println("The result is: " + (operation == null ? 0 : operation.getResult(a, b)));
		operation = operationFactory.doOperation("Invalid");
		System.out.println("The result is: " + (operation == null ? 0 : operation.getResult(a, b)));
	}
}
