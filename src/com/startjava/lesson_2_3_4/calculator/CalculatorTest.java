package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner;
    
    public static void main(String[] args) {
        // создание объектов
        Calculator calculator = new Calculator();
        scanner = new Scanner(System.in);
        
        String answerContinue = "yes";
        do {
            if (answerContinue.equals("yes") ) {
                enterMathExpression(calculator);
                try {
                    double result = calculator.calculate();
                    printResult(calculator, result);
                } catch(IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answerContinue = scanner.nextLine().toLowerCase();
        } while(!answerContinue.equals("no"));

        scanner.close();
    }

    public static void printResult(Calculator calculator, double result) {
        System.out.println(calculator.getA() + " " + calculator.getMathOperation() + " " 
                + calculator.getB() + " = " + ((result % 1 != 0) ? String.format("%.3f", result) : (int) result));
    }

    public static void enterMathExpression(Calculator calculator) {
        System.out.print("Введите математическое выражение: ");
        String inputLine = scanner.nextLine();
        String[] inputArray = inputLine.split(" ");
        calculator.setA(Integer.parseInt(inputArray[0]));
        calculator.setMathOperation(inputArray[1].charAt(0));
        calculator.setB(Integer.parseInt(inputArray[2]));
    }
}