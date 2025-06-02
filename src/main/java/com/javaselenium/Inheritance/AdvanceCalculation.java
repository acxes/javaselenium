package com.javaselenium.Inheritance;

public class AdvanceCalculation extends SimpleCalculation {

    public void power(double base, double exponent) {
        System.out.println(Math.pow(base, exponent));
    }

    public void squareRoot(double number) {
        System.out.println(Math.sqrt(number));
    }

}