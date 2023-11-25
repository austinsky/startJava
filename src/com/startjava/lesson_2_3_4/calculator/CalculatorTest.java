package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner;
    
    public static void main(String[] args) {
        // создание объектов
        scanner = new Scanner(System.in);
        
        String answerContinue = "yes";
        do {
            if (answerContinue.equals("yes") ) {
                String[] inputArray = enterMathExpression();
                try {
                    int[] parseInputNumbers = checkAndParseInputIntegerNumbers(inputArray);
                    char mathOperation = inputArray[1].charAt(0);

                    double result = Calculator.calculate(parseInputNumbers[0], mathOperation,
                            parseInputNumbers[1]);
                    printResult(inputArray, result);
                } catch(RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answerContinue = scanner.nextLine().toLowerCase();
        } while(!answerContinue.equals("no"));

        scanner.close();
    }

    public static void printResult(String[] inputArray, double result) {
        System.out.println(inputArray[0] + " " + inputArray[1].charAt(0) + " "
                + inputArray[2] + " = " + ((result % 1 != 0) ? String.format("%.3f", result) : (int) result));
    }

    public static String[] enterMathExpression() {
        System.out.print("Введите математическое выражение: ");
        String inputLine = scanner.nextLine();
        String[] inputArray = inputLine.split(" ");
        return inputArray;
    }

    public static int[] checkAndParseInputIntegerNumbers(String[] inputArray) {
        if (inputArray.length != 3) {
            throw new RuntimeException("Неправильный набор аргументов.\n" +
                    "Должно быть 3 аргумента - целое число, операция, целое число.\n" +
                    "Аргументы должны быть разделены пробелом. \n" +
                    "Пример: 2 + 3");
        }
        try {
            int a = Integer.parseInt(inputArray[0]);
            int b = Integer.parseInt(inputArray[2]);

            if (a < 0 || b < 0) {
                throw new NumberFormatException();
            }

            return new int[] {a, b};
        }
        catch (NumberFormatException e) {
            throw new RuntimeException("Числа должны быть положительными и целыми\n" +
                    "Должно быть 3 аргумента - целое число, операция, целое число.\n");
        }
    }
}