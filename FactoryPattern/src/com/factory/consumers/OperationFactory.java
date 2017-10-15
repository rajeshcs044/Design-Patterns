package com.factory.consumers;

import com.factory.Operation;
import com.factory.impl.Addition;
import com.factory.impl.Division;
import com.factory.impl.Multiplication;
import com.factory.impl.Subtraction;

public class OperationFactory {
	public Operation doOperation(String operation) {
		if (operation == "Addition") {
			return new Addition();
		} else if (operation == "Subtraction") {
			return new Subtraction();
		} else if (operation == "Multiplication") {
			return new Multiplication();
		} else if (operation == "Division") {
			return new Division();
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.print("Invalid Operation - ");
				return null;
			}
		}
	}
}
