package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String answerContinue = "yes";
        do {
            if (answerContinue.equals("yes") ) {
                String mathExpression = enterMathExpression();
                try {
                    double result = Calculator.calculate(mathExpression);
                    printResult(mathExpression, result);
                } catch(RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answerContinue = scanner.nextLine().toLowerCase();
        } while(!answerContinue.equals("no"));

        scanner.close();
    }

    public static void printResult(String mathExpression, double result) {
        System.out.println(mathExpression + " = " + ((result % 1 != 0) ? String.format("%.3f", result) : (int) result));
    }

    public static String enterMathExpression() {
        System.out.print("Введите математическое выражение: ");
        return scanner.nextLine();
    }
}