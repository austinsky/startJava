package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName1 = enterPlayerName("Введите имя первого игрока: ", scanner);
        String playerName2 = enterPlayerName("Введите имя второго игрока: ", scanner);
        String playerName3 = enterPlayerName("Введите имя третьего игрока: ", scanner);

        GuessNumber game = new GuessNumber(new String[] {playerName1, playerName2, playerName3}, scanner);

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

    public static String enterPlayerName(String message, Scanner scanner) {
        System.out.print(message);
        return  scanner.nextLine();
    }
}