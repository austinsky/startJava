package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static final int MAX_COUNT_ATTEMPT = 2;
    public static final int COUNT_ROUNDS = 3;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;

    private Player[] players;

    private Scanner scanner;

    public GuessNumber(String[] playerNames, Scanner scanner) {
        players = new Player[GuessNumberTest.COUNT_PLAYERS];
        for(int i = 0; i < GuessNumberTest.COUNT_PLAYERS; i++) {
            players[i] = new Player(playerNames[i]);
        }
        this.scanner = scanner;
    }

    public void start() {
        Random random = new Random();
        shuffleDurstenfeld();

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            for(Player player : players) {
                player.clear();
            }
            int guessNumber = random.nextInt(GuessNumber.START_RANGE, GuessNumber.END_RANGE + 1);
            System.out.println("Игра началась! У каждого игрока по " + MAX_COUNT_ATTEMPT + " попыток.");

            System.out.println("===================");
            System.out.println("Раунд: " + (i + 1));
            System.out.println("===================");

            boolean isEndRound = false;
            while (!isEndRound) {
                for (Player player : players) {
                    if (!hasAttempt()) {
                        System.out.println("Никто не угадал. Загаданное число: " + guessNumber);
                        isEndRound = true;
                        break;
                    }
                    enterNumber(player);
                    if (isGuessed(player, guessNumber)) {
                        isEndRound = true;
                        break;
                    }
                }
            }
            printAllPlayersNumbers();
        }

        defineWinner();
        printScore();
    }

    private boolean hasAttempt() {
        boolean result = false;

        for (Player player : players) {
            if (player.getAttempt() < MAX_COUNT_ATTEMPT) {
                result = true;
                break;
            }
        }

        return result;
    }

    private void shuffleDurstenfeld() {
        Random random = new Random();

        for (int i = players.length; i > 0; i--) {
            int randomIndex = random.nextInt(i);
            Player randomPlayer = players[randomIndex];
            players[randomIndex] = players[i - 1];
            players[i - 1] = randomPlayer;
        }
    }

    private void enterNumber(Player player) {
        int numberAttempt = player.getAttempt();
        if (numberAttempt > MAX_COUNT_ATTEMPT) {
            System.out.println("У " + player.getName() + " закончились попытки");
        } else {
            int playerNumber;
            boolean isAddNumber;
            do {
                System.out.print(player.getName() + " введите ваше число: ");
                playerNumber = scanner.nextInt();
                scanner.nextLine();
                isAddNumber = player.addNumber(playerNumber);
                if (!isAddNumber) {
                    System.out.println("Введите число в диапазоне [" + GuessNumber.START_RANGE + "," +
                            GuessNumber.END_RANGE + " ]");
                }
            } while (!isAddNumber);
        }
    }

    private boolean isGuessed(Player currentPlayer, int guessNumber) {
        int numberAttempt = currentPlayer.getAttempt();

        int playerNumber = currentPlayer.getNumber();
        if (playerNumber == guessNumber) {
            System.out.println("Игрок " + currentPlayer.getName() +
                    " угадал число " + guessNumber + " с " + numberAttempt + " попытки");
            currentPlayer.addScore();
            return true;
        }

        System.out.println("Число " + playerNumber +
                " " + ((playerNumber < guessNumber) ? "меньше" : "больше") +
                " того, что загадал компьютер");
        return false;
    }

    private void printAllPlayersNumbers() {
        for (Player player : players) {
            System.out.print(player.getName() + ": \t");
            int[] playerNumbers = player.getNumbers();
            for(int number : playerNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void defineWinner() {
        Player winner = getWinner();
        if (winner == null) {
            System.out.println("Победила дружба");
        } else {
            System.out.println("Победитель: " + winner.getName() + " с количеством очков " + winner.getScore());
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

    private void printScore() {
        System.out.println("Очки участников:");
        for(Player player : players) {
            System.out.println(player.getName() + ": \t" + player.getScore());
        }
    }
}