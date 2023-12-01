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
        boolean isValidNumber = number > GuessNumber.START_RANGE
                && number <= GuessNumber.END_RANGE;
        if (attempt < GuessNumber.MAX_COUNT_ATTEMPT && isValidNumber) {
            numbers[attempt++] = number;
            return true;
        }
        return false;
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