package com.strategy.pattern.impl;

import com.stategy.pattern.Operation;

public class Division implements Operation
{
    @Override
    public int result(int a, int b)
    {
        return a / b;
    }
}
