package com.javaselenium.Abstraction;

public abstract class AbstractCalculation {
    public abstract void add(int a, int b);

    public abstract void subtract(int a, int b);

    public abstract void multiply(int a, int b);

    public abstract void divide(int a, int b);

    public void getCalculator() {
        System.out.println("Simple Calculator");
    }

}