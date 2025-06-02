package com.javaselenium.Encapsulation;

public class SimpleCalculation {

    // public int result;
    private int result;

    public int getResult() {
        return result;
    }

    private int a;

    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add() {
        result = a + b;
        // System.out.println(result);
    }

    public void subtract() {
        result = a - b;
        System.out.println(result);
    }

    public void multiply() {
        result = a * b;
        System.out.println(result);
    }

    public void divide() {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        }
        result = a / b;

    }
}