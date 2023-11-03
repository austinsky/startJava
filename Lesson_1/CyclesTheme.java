public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int beginInterval = -10;
        int endInterval = 21;

        // счетчик четных чисел
        int evenCounter = 0; 

        // счетчик нечетных чисел
        int oddCounter = 0;          

        for (int i = beginInterval; i <= endInterval; i++) {
            if (i % 2 == 0) 
                ++evenCounter;
            else
                ++oddCounter;
        }
        System.out.println("В отрезке [" + beginInterval + ", " + endInterval + 
                "] сумма четных чисел = " + evenCounter + ", а нечетных = " + oddCounter + "\n");


        // 2. Вывод чисел в порядке убывания
        System.out.println("2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3; 
        System.out.println("min = " + min + " max = " + max);
        for (int i = min; i <= max; i++) {
            System.out.print("" + i + " ");
        }
        System.out.println("\n");   

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println("\nСумма чисел = " + sum + "\n"); 

        // 4. Вывод чисел в несколько строк
        System.out.println("4. Вывод чисел в несколько строк");
        int startInterv = 1;
        int endInterv = 24;
        // int endInterv = 30;
        int countDigit = 0;

        for (int i = startInterv; i < endInterv; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                ++countDigit;
                if (countDigit == 5) {
                    System.out.println();
                    countDigit = 0;
                }
            }
        }

        for (int i = countDigit; i < 5 && i != 0; i++) {
            System.out.printf("%3d", 0);
        }
        System.out.println("\n");

        // 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int numberForTask5 = 3242592;
        int srcNumberForTask5 = numberForTask5;
        int countSymbols2 = 0;
        while(numberForTask5 > 0) {
            int digit = numberForTask5 % 10;
            if (digit == 2) 
                ++countSymbols2;

            numberForTask5 /= 10;
        }
        if (countSymbols2 % 2 == 0) {
            System.out.println("В " + srcNumberForTask5 
                    + " (четное) количество двоек — " + countSymbols2 +"\n");
        } else {
            System.out.println("В " + srcNumberForTask5 
                    + " (нечетное) количество двоек — " + countSymbols2 + "\n");
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
                --row;
                column = row;
                System.out.println();
            } 
        }
        System.out.println();

        // второй треугольник
        int maxElementsPerLine = 1;
        int countElementsPerLine = 0;
        int sign = 0;               
        do {
            countElementsPerLine = 0;
            do {
                System.out.print("$");
                countElementsPerLine++;
            } while (countElementsPerLine < maxElementsPerLine);
            System.out.println();
            
            if (sign == 1) 
                maxElementsPerLine--;
            else if (sign == 0) 
                maxElementsPerLine++;

            if (maxElementsPerLine == 3 || maxElementsPerLine == 0) sign++;
        } while (sign < 2);
        System.out.println();

        // 7. Отображение ASCII-символов
        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%-10s %-15s %-20s%n", "DECIMAL",  "CHARACTER",  "DESCRIPTION");

        for (int symbol = 15; symbol < 48; symbol++) {
            if (symbol % 2 != 0) {
                System.out.printf("%-12s %-11s %-15s%n", " " + symbol, " " 
                        + (char)symbol, Character.getName(symbol));
            }
        }

        for (int symbol = 97; symbol < 123; symbol++) {
            if (symbol % 2 == 0) {
                System.out.printf("%-12s %-11s %-15s%n", " " 
                        + symbol, " " + (char)symbol, Character.getName(symbol));
            }
        }
        System.out.println();

        // 8. Проверка, является ли число палиндромом
        System.out.println("8. Проверка, является ли число палиндромом");
        // int a1 = 1234321;
        int numPolyndrome = 123221;
        int reverseNum = 0;
        int tmpNumPolyndrome = numPolyndrome;

        while (tmpNumPolyndrome > 0) {
            reverseNum = reverseNum * 10 + tmpNumPolyndrome % 10;
            tmpNumPolyndrome /= 10;
        }

        if (reverseNum == numPolyndrome) {
            System.out.println("число " + numPolyndrome + " является палиндромом\n");
        } else {
            System.out.println("число " + numPolyndrome + " не является палиндромом\n");
        }

        // 9. Проверка, является ли число счастливым
        System.out.println("9. Проверка, является ли число счастливым");
        int happyNumber = 123321;
        int hundredsThousandsHappyNumber = happyNumber / 1000;
        int thousandsHappyNumber  = happyNumber % 1000;
        int s1 = hundredsThousandsHappyNumber / 100 
                + ((hundredsThousandsHappyNumber % 100) / 10) + (hundredsThousandsHappyNumber % 10);
        int s2 = thousandsHappyNumber  / 100 + ((thousandsHappyNumber  % 100) / 10) 
                + (thousandsHappyNumber  % 10); 

        if (s1 == s2) {
            System.out.println("Число " + happyNumber + " является счастливым");   
        } else {
            System.out.println("Число " + happyNumber + " не является счастливым"); 
        }

        System.out.println("Сумма цифр "+ hundredsThousandsHappyNumber + " = " 
                + s1 + ", а сумма " + thousandsHappyNumber + " = " + s2 + "\n");

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