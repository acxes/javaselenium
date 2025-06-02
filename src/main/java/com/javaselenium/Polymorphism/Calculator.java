package com.javaselenium.Polymorphism;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1;
        int number2;
        String operator;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        number1 = sc.nextInt();
        System.out.println("Enter opration symbol");
        operator = sc.next();
        System.err.println("Enter number");
        number2 = sc.nextInt();

        SimpleCalculation simpleCalculation = new SimpleCalculation();
        AdvanceCalculation calculation = new AdvanceCalculation();

        switch (operator) {
            case "+":
                calculation.add(number1, number2);
                break;

            case "-":
                calculation.subtract(number1, number2);
                break;

            case "*":
                calculation.multiply(number1, number2);
                break;

            case "/":
                calculation.divide(number1, number2);
                break;

            case "s":
                simpleCalculation.getCalculator();
                break;

            case "a":
                calculation.getCalculator();
                break;

            default:
                break;
        }
        sc.close();
    }
}
