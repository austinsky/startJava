package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static final int COUNT_PLAYERS = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playersNames = new String[COUNT_PLAYERS];
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            String playerName = enterPlayerName("Введите имя " + (i + 1) + " игрока: ", scanner);
            playersNames[i] = playerName;
        }
        GuessNumber game = new GuessNumber(playersNames, scanner);

        String answerContinue = "yes";
        do {
            if (answerContinue.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answerContinue = scanner.nextLine().toLowerCase();
        } while(!answerContinue.equals("no"));
        scanner.close();
    }

    private static String enterPlayerName(String message, Scanner scanner) {
        System.out.print(message);
        return  scanner.nextLine();
    }
}