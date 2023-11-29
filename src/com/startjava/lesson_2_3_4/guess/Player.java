package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.MAX_COUNT_ATTEMPT];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public boolean addNumber(int number) {
        if (attempt < GuessNumber.MAX_COUNT_ATTEMPT && number > GuessNumber.MIN_VALUE_GUESS_NUMBER
                && number <= GuessNumber.MAX_VALUE_GUESS_NUMBER) {
            numbers[attempt++] = number;
            return true;
        } else {
            System.out.println("Введите число в диапазоне (" + GuessNumber.MIN_VALUE_GUESS_NUMBER + "," +
                    GuessNumber.MAX_VALUE_GUESS_NUMBER + " ]");
            return false;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void clear() {
        if (attempt > 0) {
            Arrays.fill(numbers, 0, attempt, 0);
            attempt = 0;
        }
    }
}