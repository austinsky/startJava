package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player[] players;

    private Scanner scanner;

    public static final int MAX_COUNT_ATTEMPT = 2;
    public static final int COUNT_ROUND = 3;

    public GuessNumber(String[] playerNames, Scanner scanner) {
        this.players = new Player[playerNames.length];
        for(int i = 0; i < playerNames.length; i++) {
            this.players[i] = new Player(playerNames[i]);
        }
        this.scanner = scanner;
    }

    public void start() {
        Random random = new Random();
        shuffleDurstenfeld();

        for (int i = 0; i < COUNT_ROUND; i++) {
            for(Player player : players) {
                player.clear();
            }
            int guessNumber = random.nextInt(100) + 1;
            System.out.println("Игра началась! У каждого игрока по " + MAX_COUNT_ATTEMPT + " попыток.");

            System.out.println("===================");
            System.out.println("Раунд: " + (i + 1));
            System.out.println("===================");

            boolean isRoundEnd = false;
            while (!isRoundEnd) {
                for (Player player : players) {
                    if (players[0].getAttempt() >= MAX_COUNT_ATTEMPT
                            && players[1].getAttempt() >= MAX_COUNT_ATTEMPT
                            && players[2].getAttempt() >= MAX_COUNT_ATTEMPT) {
                        System.out.println("Никто не угадал. Загаданное число: " + guessNumber);
                        isRoundEnd = true;
                        break;
                    }
                    enterNumber(player);
                    if (isGuessed(player, guessNumber)) {
                        isRoundEnd = true;
                        break;
                    }
                }
            }
            printAllPlayersNumbers();
        }

        printWinner();
        preintScore();
    }

    private int enterNumber(Player player) {
        int numberAttempt = player.getAttempt();
        if (numberAttempt > MAX_COUNT_ATTEMPT) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return 0;
        } else {
            int playerNumber;
            do {
                System.out.print(player.getName() + " введите ваше число: ");
                playerNumber = scanner.nextInt();
                scanner.nextLine();
                if (playerNumber <= 0 || playerNumber > 100) {
                    System.out.println("Введите число в диапазоне (0, 100]");
                }
            } while (playerNumber <= 0 || playerNumber > 100);

            player.setNumber(playerNumber);
            return playerNumber;
        }
    }

    private boolean isGuessed(Player currentPlayer,  int guessNumber) {
        int numberAttempt = currentPlayer.getAttempt();

        int playerNumber = currentPlayer.getNumber(numberAttempt - 1);
        if (playerNumber != guessNumber) {
            System.out.println("Число " + playerNumber +
                    " " + ((playerNumber < guessNumber) ? "меньше" : "больше") +
                    " того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + currentPlayer.getName() +
                    " угадал  число " + guessNumber + " с " + numberAttempt + " попытки");
            currentPlayer.addScore();
            return true;
        }
        return false;
    }

    private void printAllPlayersNumbers() {
        for (Player player : players) {
            System.out.print(player.getName() + ": \t");
            int[] playerNumbers = player.getNumbers();
            for(int i = 0; i < player.getAttempt(); i++) {
                System.out.print(playerNumbers[i] + " ");
            }
            System.out.println();
        }
    }

    private void shuffleDurstenfeld() {
        Random random = new Random();

        for (int i = players.length; i > 0; i--) {
            int randomIndex = random.nextInt(i);
            Player randomPlayer = players[randomIndex];

            // смещение элементов от random index до length - 1
            for(int j = randomIndex; j < i - 1; j++) {
                players[j] = players[j + 1];
            }

            players[i - 1] = randomPlayer;
        }
    }

    private Player getWinner() {
        int maxScore = 0;
        Player winner = null;
        for(Player player: players) {
            if (maxScore < player.getScore()) {
                maxScore = player.getScore();
                winner = player;
            } else if (maxScore == player.getScore()) {
                winner = null;
            }
        }

        return winner;
    }

    private void printWinner() {
        Player winner = getWinner();
        if (winner == null) {
            System.out.println("Победила дружба");
        } else {
            System.out.println("Победитель: " + winner.getName() + " с количеством очков " + winner.getScore());
        }
    }

    private void preintScore() {
        System.out.println("Очки участников:");
        for(Player player: players) {
            System.out.println(player.getName() + ": \t" + player.getScore());
        }
    }
}