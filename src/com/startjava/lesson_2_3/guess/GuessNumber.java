package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1;
        Player player = player1;
            
        while(true) {
            enterNumber(player);
            if (isGuessed(player, guessNumber)) {
                break;
            }
            player = (player == player1) ? player2 : player1;
        }
    }

    private int enterNumber(Player player) {
        System.out.print(player.getName() + " введите ваше число: ");
        int playerNumber = scanner.nextInt();
        scanner.nextLine();
        player.setNumber(playerNumber);
        return playerNumber;
    }

    private boolean isGuessed(Player currentPlayer,  int guessNumber) {
        int playerNumber = currentPlayer.getNumber();
        if (playerNumber < guessNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else if (playerNumber > guessNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber == guessNumber) {
            System.out.println(currentPlayer.getName() + " - Вы победили!");
            return true;
        }
        return false;
    }
}