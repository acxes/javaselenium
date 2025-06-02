package com.javaselenium.Encapsulation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String operator;

        Scanner sc = new Scanner(System.in);
        SimpleCalculation calculation = new SimpleCalculation();

        System.out.println("Enter number");
        calculation.setA(sc.nextInt());
        System.out.println("Enter opration symbol");
        operator = sc.next();
        System.err.println("Enter number");
        calculation.setB(sc.nextInt());

        switch (operator) {
            case "+":
                calculation.add();
                System.out.println("Result is :" + calculation.getResult());
                break;

            case "-":
                calculation.subtract();
                System.out.println("Result is :" + calculation.getResult());
                break;

            case "*":
                calculation.multiply();
                System.out.println("Result is :" + calculation.getResult());
                break;

            case "/":
                calculation.divide();
                System.out.println("Result is :" + calculation.getResult());
                break;

            default:
                break;
        }
        sc.close();
    }
}
