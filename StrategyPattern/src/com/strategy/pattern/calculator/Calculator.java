package com.strategy.pattern.calculator;

import com.stategy.pattern.Operation;
import com.strategy.pattern.impl.Addition;
import com.strategy.pattern.impl.Division;
import com.strategy.pattern.impl.Multiplication;
import com.strategy.pattern.impl.Subtraction;

public class Calculator
{
    private Operation operation;

    public void setOperation(Operation operation)
    {
        this.operation = operation;
    }

    public void calculate(int a, int b)
    {
        System.out.println("Output value is: " + operation.result(a, b));
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.setOperation(new Addition());
        calc.calculate(20, 15);
        calc.setOperation(new Subtraction());
        calc.calculate(20, 15);
        calc.setOperation(new Multiplication());
        calc.calculate(20, 15);
        calc.setOperation(new Division());
        calc.calculate(20, 15);
    }
}
