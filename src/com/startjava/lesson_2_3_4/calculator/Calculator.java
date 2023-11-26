package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] inputArray = mathExpression.split(" ");
        int[] parseInputNumbers = checkAndParseInputIntegerNumbers(inputArray);
        char mathOperation = inputArray[1].charAt(0);
        int a = parseInputNumbers[0];
        int b = parseInputNumbers[1];
        return switch (mathOperation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b != 0) {
                    yield (double) a / b;
                }
                throw new IllegalArgumentException("Недопустимая операция: деление на 0");
            }
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new RuntimeException("Ошибка: знак " + mathOperation + " не поддерживается");
        };
    }

    private static int[] checkAndParseInputIntegerNumbers(String[] inputArray) {
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

            return new int[]{a, b};
        } catch (NumberFormatException e) {
            throw new RuntimeException("Числа должны быть положительными и целыми\n" +
                    "Должно быть 3 аргумента - целое число, операция, целое число.\n");
        }
    }
}