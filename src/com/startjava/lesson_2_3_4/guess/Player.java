package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;

    private int counter;
    private int score;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.MAX_COUNT_ATTEMPT];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        if (index >= 0 && index < GuessNumber.MAX_COUNT_ATTEMPT) {
            return numbers[index];
        }
        throw new RuntimeException("Player::getNumber(): неверный индекс");
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, counter);
    }

    public void setNumber(int number) {
        if (counter < GuessNumber.MAX_COUNT_ATTEMPT && number > 0 && number <= 100) {
            numbers[counter++] = number;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void resetCounter() {
        if (counter > 0) {
            Arrays.fill(numbers, 0, counter - 1, 0);
            counter = 0;
        }
    }

}