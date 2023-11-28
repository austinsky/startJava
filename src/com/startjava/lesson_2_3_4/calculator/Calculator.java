package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

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

    private static void validExpression(String[] elements) {
        int a;
        int b;
        if (elements.length != 3) {
            throw new RuntimeException("Неправильный набор аргументов.\n" +
                    "Должно быть 3 аргумента - целое число, операция, целое число.\n" +
                    "Аргументы должны быть разделены пробелом. \n" +
                    "Пример: 2 + 3");
        }
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Числа должны быть положительными и целыми\n" +
                    "Должно быть 3 аргумента - целое число, операция, целое число.\n");
        }

        if (a <= 0 || b <= 0) {
            throw new RuntimeException("Введенные числа должны быть положительными.");
        }
    }
}