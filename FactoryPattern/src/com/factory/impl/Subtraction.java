package com.factory.impl;

import com.factory.Operation;

public class Subtraction implements Operation {
	@Override
	public int getResult(int a, int b) {
		return a - b;
	}
}
