package com.javaselenium.Inheritance;

public class SimpleCalculation {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }
}