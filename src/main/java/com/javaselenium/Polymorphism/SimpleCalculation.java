package com.javaselenium.Polymorphism;

public class SimpleCalculation {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public void subtract(double a, double b) {
        System.out.println(a - b);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }

    public void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }

    public void getCalculator() {
        System.out.println("Simple Calculator");
    }
}