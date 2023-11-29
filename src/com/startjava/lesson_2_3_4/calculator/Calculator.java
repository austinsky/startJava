package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final String ARGUMENT_EXCEPTION_MESSAGE = "Должно быть 3 аргумента - целое число, операция, целое число.\n";
    private static final String ARGUMENT_NUMBER_EXCEPTION_MESSAGE = "Неправильный набор аргументов.\n";
    private static final String ARGUMENT_SPACE_EXCEPTION_MESSAGE = "Аргументы должны быть разделены пробелом. \n";
    private static final String ARGUMENT_EXAMPLE_EXCEPTION_MESSAGE = "Пример: 2 + 3";
    private static final String INVALID_TYPE_ARGUMENT_EXCEPTION_MESSAGE = "Числа должны быть целыми (int)\n";
    private static final String ARGUMENT_POSITIVE_EXCEPTION_MESSAGE = "Введенные числа должны быть положительными.\n";


    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        validExpression(elements);
        int a = Integer.parseInt(elements[0]);
        char mathOperation = elements[1].charAt(0);
        int b = Integer.parseInt(elements[2]);
        return switch (mathOperation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (double) a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new RuntimeException("Ошибка: знак " + mathOperation + " не поддерживается");
        };
    }

    private static void validExpression(String[] elements) {
        if (elements.length != 3) {
            throw new RuntimeException( ARGUMENT_NUMBER_EXCEPTION_MESSAGE + ARGUMENT_EXCEPTION_MESSAGE +
                     ARGUMENT_SPACE_EXCEPTION_MESSAGE + ARGUMENT_EXAMPLE_EXCEPTION_MESSAGE);
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(INVALID_TYPE_ARGUMENT_EXCEPTION_MESSAGE + ARGUMENT_EXCEPTION_MESSAGE);
        }

        if (a <= 0 || b <= 0) {
            throw new RuntimeException(ARGUMENT_POSITIVE_EXCEPTION_MESSAGE);
        }
    }
}