package com.javaselenium.Abstraction;

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

        AbstractCalculation calculation = new SimpleCalculation();

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

            default:
                break;
        }
        sc.close();
    }
}
