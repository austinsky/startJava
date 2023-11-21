package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char mathOperation;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public double calculate() {
        switch(mathOperation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Недопустимая операция: деление на 0");
                }
                return (double) a / b;
            case '^':
                return Math.pow(a, b);
            case '%':
                return a % b;
            default:
                throw new IllegalArgumentException("Ошибка: знак " + mathOperation + " не поддерживается");
        }
    }
}