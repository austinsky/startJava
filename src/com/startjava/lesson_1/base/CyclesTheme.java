package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int beginInterval = -10;
        int endInterval = 21;

        // счетчик четных чисел
        int evenSum = 0; 

        // счетчик нечетных чисел
        int oddSum = 0;          

        int counter = beginInterval;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
        } while (counter++ < endInterval);

        System.out.println("В отрезке [" + beginInterval + ", " + endInterval + 
                "] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum + "\n");


        // 2. Вывод чисел в порядке убывания
        System.out.println("2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;

        if (max < num2) {
            max = num2;
        }

        if (max < num3) {
            max = num3;
        } 

        if (min > num2) {
            min = num2;
        }

        if (min > num3) {
            min = num3;
        }

        System.out.println("min = " + min + " max = " + max);
        for (int i = min + 1; i < max; i++) {
            System.out.print("" + i + " ");
        }
        System.out.println("\n");   

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма чисел = " + sum + "\n"); 

        // 4. Вывод чисел в несколько строк
        System.out.println("4. Вывод чисел в несколько строк");
        beginInterval = 1;
        endInterval = 24;
        int countDigits = 0;

        for (int i = beginInterval; i < endInterval; i += 2) {
            System.out.printf("%3d", i);
            countDigits++;
            if (countDigits == 5) {
                System.out.println();
                countDigits = 0;
            }
        }

        for (int i = countDigits; i > 0 && i < 5; i++) {
            System.out.printf("%3d", 0);
        }
        System.out.println("\n");

        // 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int srcNum = 3242592;
        int copySrcNum = srcNum;
        int countTwos = 0;
        while(copySrcNum > 0) {
            if ((copySrcNum % 10) == 2) {
                countTwos++;
            }
            copySrcNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + srcNum 
                    + " (четное) количество двоек — " + countTwos);
        } else {
            System.out.println("В " + srcNum 
                    + " (нечетное) количество двоек — " + countTwos);
        }
        System.out.println();

        // 6. Отображение геометрических фигур
        System.out.println("6. Отображение геометрических фигур");
        // прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // треугольник
        int row = 5;
        int column = row;
        while (row > 0) {
            System.out.print("#");
            column--;
            if (column == 0) {
                column = --row;
                System.out.println();
            } 
        }
        System.out.println();

        // второй треугольник
        row = 1;
        column = 0;
        int sign = 0;               
        do {
            column = 0;
            do {
                System.out.print("$");
                column++;
            } while (column < row);
            System.out.println();
            
            if (sign == 1) {
                row--;
            } else if (sign == 0) { 
                row++;
            }

            if (row == 3 || row == 0) { 
                sign++;
            }
        } while (sign < 2);
        System.out.println();

        // 7. Отображение ASCII-символов
        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%-10s %-15s %-20s%n", "DECIMAL",  "CHARACTER",  "DESCRIPTION");

        for (char symbol = 15; symbol < 48; symbol++) {
            if (symbol % 2 != 0) {
                System.out.printf(" %-12d %-17c %s%n", (int) symbol, 
                        symbol, Character.getName(symbol));
            }
        }

        for (char symbol = 97; symbol < 123; symbol++) {
            if (symbol % 2 == 0) {
                System.out.printf(" %-12d %-17c %s%n", (int) symbol, 
                        symbol, Character.getName(symbol));
            }
        }
        System.out.println();

        // 8. Проверка, является ли число палиндромом
        System.out.println("8. Проверка, является ли число палиндромом");
        int palindrome = 123221;
        int reverseNum = 0;
        int copyPalindrome = palindrome;

        while (copyPalindrome > 0) {
            reverseNum = reverseNum * 10 + copyPalindrome % 10;
            copyPalindrome /= 10;
        }

        if (reverseNum == palindrome) {
            System.out.println("число " + palindrome + " является палиндромом\n");
        } else {
            System.out.println("число " + palindrome + " не является палиндромом\n");
        }

        // 9. Проверка, является ли число счастливым
        System.out.println("9. Проверка, является ли число счастливым");
        int happyNumber = 123321;
        int leftHalf = happyNumber / 1000;
        int rightHalf  = happyNumber % 1000;
        int copyLeftHalf = leftHalf;
        int copyRightHalf = rightHalf;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;

        while (copyLeftHalf > 0 || copyRightHalf > 0) {
            sumLeftHalf += copyLeftHalf % 10;
            copyLeftHalf /= 10;
            sumRightHalf += copyRightHalf % 10;
            copyRightHalf /= 10;
        }

        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + happyNumber + " является счастливым");   
        } else {
            System.out.println("Число " + happyNumber + " не является счастливым"); 
        }

        System.out.println("Сумма цифр "+ leftHalf + " = " 
                + sumLeftHalf + ", а сумма " + rightHalf + " = " + sumRightHalf + "\n");

        // 10. Отображение таблицы умножения Пифагора
        System.out.println("10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%3s", " ");
                } else if (j == 1) {
                    System.out.printf("%2s", "|");
                } else if (i == 1) {
                    System.out.printf("%3s", "---");    
                } else if (i == 0) {
                    System.out.printf("%3s", j);    
                } else if (j == 0) {
                    System.out.printf("%3s", i);    
                } else {
                    System.out.printf("%3d", i * j);
                }    
            }
            System.out.println();
        }
    }
}
