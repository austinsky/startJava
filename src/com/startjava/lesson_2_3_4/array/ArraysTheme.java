package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArraysTheme {

    public static void main(String[] args) {
        // 1. Реверс значений массива
        reverseArray(new int[] {1, 7, 4, 5, 2, 6, 3});
        System.out.println();

        // 2. Произведение элементов массива
        multiplicationArray(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();

        // 3. Удаление элементов массива
        deleteElementsArray();
        System.out.println();

        // 4. Вывод алфавита лесенкой
        alpabitLadder();
        System.out.println();

        // 5. Заполнение массива уникальными числами
        generateUniqueNumber();

    }

    // 1. Реверс значений массива
    public static void reverseArray(int[] array) {
        System.out.println("1. Реверс значений массива");
        int len = array.length;
        System.out.print("До реверса: ");
        printArray(array);

        for (int i = 0; i < len / 2; i++) {
            int tmp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = tmp;
        }

        System.out.print("После реверса: ");
        printArray(array);
    }

    // 2. Произведение элементов массива
    public static void multiplicationArray(int[] array) {
        System.out.println("2. Произведение элементов массива");
        long result = 1;
        for (int i = 1; i < array.length - 1; i++) {
            result *= array[i];
            String operation = (array.length - 2 == i) ? " = " : " + ";
            System.out.print(i + operation);
        }
        System.out.println(result);
    }

    // 3. Удаление элементов массива
    public static void deleteElementsArray() {
        System.out.println("3. Удаление элементов массива");

        // Заполнение массива произвольными числами
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        // Средняя ячейка массива
        int avgLen = array.length / 2;
        double etalonNumber = array[avgLen];

        // Счетчик изменений
        int counterChange = 0;

        System.out.println("Исходный массив: ");
        printArray(array);

        for (int i = 0;  i < array.length; i++) {
            if (array[i] > etalonNumber) {
                array[i] = 0;
                counterChange++;
            }
        }
        System.out.println("Измененный массив: ");
        printArray(array);
        System.out.println("количество обнуленных ячеек: " + counterChange);
    }

    // 4. Вывод алфавита лесенкой
    public static void alpabitLadder() {
        System.out.println("4. Вывод алфавита лесенкой");

        char[] letters = new char[26];

        for (int i = 0; i < 26; i++) {
            letters[i] = (char)((int)'A' + i);
        }

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letters[letters.length - j - 1]);
            }
            System.out.println();
        }
    }

    // 5. Заполнение массива уникальными числами
    private static void generateUniqueNumber() {
        System.out.println("5. Заполнение массива уникальными числами");
        Random random = new Random();

        int[] array = new int[30];
        int len = array.length;

        for (int i = 0; i < len; i++) {
            boolean isUnique;
            int number;
            do {
                isUnique = true;
                number = random.nextInt(40) + 60;
                for (int j = 0; j < i; j++) {
                    if (array[j] == number) {
                        isUnique = false;
                    }
                }
            } while (isUnique == false);
            array[i] = number;
        }

        // пузырьковая сортировка
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }

        // вывод
        for (int i = 0; i < len; i++) {
            String delimiter = ((i + 1) % 10 == 0) ? "\n" : " ";
            System.out.print(array[i] + delimiter);
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
        for (int i = 0; i < array.length; i++) {
            String delimiter = ((i + 1) % 8 == 0) ? "\n" : " ";
            System.out.printf("%.3f" + delimiter, array[i]);
        }
        System.out.println();
    }
}
