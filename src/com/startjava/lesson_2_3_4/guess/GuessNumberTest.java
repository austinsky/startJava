package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String playerName1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String playerName2 = scanner.nextLine();

        System.out.print("Введите имя третьего игрока: ");
        String playerName3 = scanner.nextLine();
        GuessNumber game = new GuessNumber(playerName1, playerName2, playerName3, scanner);

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
}