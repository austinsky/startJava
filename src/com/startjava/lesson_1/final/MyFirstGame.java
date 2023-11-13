package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        // число которое надо угадать
        int target = 50;     

        // число с которого начинаем угадывать (аналог Math.random)
        int playerNum = 48;       

        int start = 0;
        int end = 100;

        while (playerNum != target) {
            if (playerNum < target) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                start = playerNum + 1;
            } else if (playerNum > target) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                end = playerNum - 1;
            }

            playerNum = (start + end) / 2;
        } 

        System.out.println("Вы победили!");
    }
}