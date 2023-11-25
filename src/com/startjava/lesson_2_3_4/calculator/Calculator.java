package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private Calculator() {}

    public static double calculate(int a, char mathOperation, int b) {
        return switch(mathOperation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b != 0) {
                    yield (double) a / b;
                } else {
                    throw new IllegalArgumentException("Недопустимая операция: деление на 0");
                }
            }
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default ->
                throw new RuntimeException("Ошибка: знак " + mathOperation + " не поддерживается");
        };
    }
}