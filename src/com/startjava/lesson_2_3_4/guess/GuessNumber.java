package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player[] players;

    private Scanner scanner;

    public static final int MAX_COUNT_ATTEMPT = 2;
    public static final int COUNT_ROUND = 3;

    public GuessNumber(String playerName1, String playerName2, String playerName3, Scanner scanner) {
        this.players = new Player[] { new Player(playerName1), new Player(playerName2),
                new Player(playerName3) };
        this.scanner = scanner;
    }

    public void start() {
        Random random = new Random();
        players = shuffleDurstenfeld(players);

        for (int i = 0; i < COUNT_ROUND; i++) {
            for(Player player : players) {
                player.resetCounter();
            }
            int guessNumber = random.nextInt(100) + 1;
            System.out.println("Игра началась! У каждого игрока по " + MAX_COUNT_ATTEMPT + " попыток.");

            Player player = players[0];

            System.out.println("===================");
            System.out.println("Раунд: " + (i + 1));
            System.out.println("===================");

            while (true) {
                if (players[0].getCounter() >= MAX_COUNT_ATTEMPT
                        && players[1].getCounter() >= MAX_COUNT_ATTEMPT
                        && players[2].getCounter() >= MAX_COUNT_ATTEMPT) {
                    System.out.println("Никто не угадал. Загаданное число: " + guessNumber);
                    break;
                }
                enterNumber(player);
                if (isGuessed(player, guessNumber)) {
                    break;
                }
                player = (player == players[0]) ? players[1] : ((player == players[1]) ? player = players[2] : players[0]);
            }
            printAllPlayersNumbers();
        }

        Player winner = getWinner();
        if (winner == null) {
            System.out.println("Победила дружба");
        } else {
            System.out.println("Победитель: " + winner.getName() + " с количеством очков " + winner.getScore());
        }

        System.out.println("Очки участников:");
        for(Player player: players) {
            System.out.println(player.getName() + ": \t" + player.getScore());
        }
    }

    private int enterNumber(Player player) {
        int numberAttempt = player.getCounter();
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
                    System.out.println("Введите число в диапозоне (0, 100]");
                }
            } while (playerNumber <= 0 || playerNumber > 100);

            player.setNumber(playerNumber);
            return playerNumber;
        }
    }

    private boolean isGuessed(Player currentPlayer,  int guessNumber) {
        int numberAttempt = currentPlayer.getCounter();

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
            for(int i = 0; i < player.getCounter(); i++) {
                System.out.print(playerNumbers[i] + " ");
            }
            System.out.println();
        }
    }

    private Player[] shuffleDurstenfeld(Player[] sourceArray) {
        Random random = new Random();
        Player[] resultArray = new Player[sourceArray.length];
        Player[] copyArray = new Player[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            copyArray[i] = sourceArray[i];
        }

        for (int i = sourceArray.length; i > 0; i--) {
            int randomIndex = random.nextInt(i);
            resultArray[i - 1] = copyArray[randomIndex];

            // Создание нового массива без элемента с индексом randomIndex
            Player[] newArray = new Player[i - 1];
            int indexNewArray = 0;

            for (int j = 0; j < i; j++) {
                if (j != randomIndex) {
                    newArray[indexNewArray++] = copyArray[j];
                }
            }
            copyArray = newArray;
        }

        return resultArray;
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
}