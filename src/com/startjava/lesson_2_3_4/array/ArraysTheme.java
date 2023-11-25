package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        // 1. Реверс значений массива
        reverseArray();
        System.out.println();

        // 2. Произведение элементов массива
        multiplyElements();
        System.out.println();

        // 3. Удаление элементов массива
        deleteElements();
        System.out.println();

        // 4. Вывод алфавита лесенкой
        printLadderAlphabet();
        System.out.println();

        // 5. Заполнение массива уникальными числами
        fillArrayUniqueNumber();

    }

    // 1. Реверс значений массива
    private static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] reverseArray = {1, 7, 4, 5, 2, 6, 3};
        int len = reverseArray.length - 1;
        System.out.print("До реверса: ");
        printArray(reverseArray);

        for (int i = 0; i < len; i++, len--) {
            int tmp = reverseArray[i];
            reverseArray[i] = reverseArray[len];
            reverseArray[len] = tmp;
        }

        System.out.print("После реверса: ");
        printArray(reverseArray);
    }

    // 2. Произведение элементов массива
    private static void multiplyElements() {
        System.out.println("2. Произведение элементов массива");
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        long result = 1;

        for (int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            String operation = (i == len - 2) ? " = " : " * ";
            System.out.print(multipliers[i] + operation);
        }
        System.out.println(result);
    }

    // 3. Удаление элементов массива
    private static void deleteElements() {
        System.out.println("3. Удаление элементов массива");

        // Заполнение массива произвольными числами
        double[] randomNumbers = new double[15];
        int len = randomNumbers.length;
        for (int i = 0; i < len; i++) {
            randomNumbers[i] = Math.random();
        }

        // Средняя ячейка массива
        double middleArrayCell = randomNumbers[len / 2];

        // Счетчик изменений
        int counterReset = 0;

        System.out.println("Исходный массив: ");
        printArray(randomNumbers);

        for (int i = 0; i < len; i++) {
            if (randomNumbers[i] > middleArrayCell) {
                randomNumbers[i] = 0;
                counterReset++;
            }
        }
        System.out.println("Измененный массив: ");
        printArray(randomNumbers);
        System.out.println("количество обнуленных ячеек: " + counterReset);
    }

    // 4. Вывод алфавита лесенкой
    private static void printLadderAlphabet() {
        System.out.println("4. Вывод алфавита лесенкой");

        char[] alphabit = new char[26];
        int len = alphabit.length;

        for (int i = 0; i < len; i++) {
            alphabit[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabit[len - j - 1]);
            }
            System.out.println();
        }
    }

    // 5. Заполнение массива уникальными числами
    private static void fillArrayUniqueNumber() {
        System.out.println("5. Заполнение массива уникальными числами");
        Random random = new Random();

        int[] uniqueNumbers = new int[30];
        int len = uniqueNumbers.length;

        for (int i = 0; i < len; i++) {
            boolean isUnique;
            int number;
            do {
                isUnique = true;
                number = random.nextInt(40) + 60;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == number) {
                        isUnique = false;
                    }
                }
            } while (isUnique == false);
            uniqueNumbers[i] = number;
        }

        // пузырьковая сортировка
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < len - 1; i++) {
                if(uniqueNumbers[i] > uniqueNumbers[i+1]) {
                    isSorted = false;

                    int buf = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[i+1];
                    uniqueNumbers[i + 1] = buf;
                }
            }
        }

        // вывод
        for (int i = 0; i < len; i++) {
            String delimiter = ((i + 1) % 10 == 0) ? "\n" : " ";
            System.out.print(uniqueNumbers[i] + delimiter);
        }
        System.out.println();
    }

    // Вывод массива
    private static void printArray(int[] array) {
        System.out.print("[");
        boolean isFirstElement = true;
        for (int number : array) {
            if (!isFirstElement) {
                System.out.print(", ");
            } else {
                isFirstElement = false;
            }
            System.out.print(number);
        }
        System.out.println("]");
    }

    private static void printArray(double[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            String delimiter = ((i + 1) % 8 == 0) ? "\n" : " ";
            System.out.printf("%.3f" + delimiter, array[i]);
        }
        System.out.println();
    }
}
