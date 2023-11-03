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

        for (int i = beginInterval; i <= endInterval; ++i) {
            if (i % 2 == 0) 
                ++evenCounter;
            else
                ++oddCounter;
        }
        System.out.println("В отрезке [" + beginInterval + ", " + endInterval + 
                "] сумма четных чисел = " + evenCounter + ", а нечетных = " + oddCounter + "\n");


        // 2. Вывод чисел в порядке убывания
        System.out.println("2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        int min = (a <= b && a <= c) ? a : (b <= a && b <= c) ? b : c; 
        System.out.println("min = " + min + " max = " + max);
        for (int i = min; i <= max; ++i) {
            System.out.print("" + i + " ");
        }
        System.out.println("\n");   

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int num = number % 10;
            sum += num;
            System.out.print(num);
            number /= 10;
        }
        System.out.println("\nСумма чисел = " + sum + "\n"); 

        // 4. Вывод чисел в несколько строк
        System.out.println("4. Вывод чисел в несколько строк");
        int startInterv = 1;
        int endInterv = 24;
        // int endInterv = 30;
        int countDigit = 0;

        for (int i = startInterv; i < endInterv; ++i) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                ++countDigit;
                if (countDigit == 5) {
                    System.out.println();
                    countDigit = 0;
                }
            }
        }

        for (int i = countDigit; i < 5 && i != 0; ++i) {
            System.out.printf("%3d", 0);
        }
        System.out.println("\n");

        // 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int digit = 3242592;
        int src_digit = digit;
        int countDvoek = 0;
        while(digit > 0) {
            int tmp_div = digit % 10;
            if (tmp_div == 2) 
                ++countDvoek;

            digit /= 10;
        }
        if (countDvoek % 2 == 0) {
            System.out.println("В " + src_digit 
                    + " (четное) количество двоек — " + countDvoek +"\n");
        } else {
            System.out.println("В " + src_digit 
                    + " (нечетное) количество двоек — " + countDvoek + "\n");
        }
        System.out.println();

        // 6. Отображение геометрических фигур
        System.out.println("6. Отображение геометрических фигур");
        // прямоугольник
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // треугольник
        int k = 5;
        int m = k;
        while (k > 0) {
            System.out.print("#");
            --m;
            if (m == 0) {
                --k;
                m = k;
                System.out.println();
            } 
        }
        System.out.println();

        // второй треугольник
        int p = 1, t = 0, sign = 0;
        do {
            t = 0;
            do {
                System.out.print("$");
                ++t;
            } while (t < p);
            System.out.println();
            
            if (sign == 1) 
                --p;
            else if (sign == 0) 
                ++p;

            if (p == 3 || p == 0) ++sign;
        } while (sign < 2);
        System.out.println();

        // 7. Отображение ASCII-символов
        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%-10s %-15s %-20s%n", "DECIMAL",  "CHARACTER",  "DESCRIPTION");

        for (int i = 15; i < 48; ++i) {
            if (i % 2 != 0) {
                System.out.printf("%-12s %-11s %-15s%n", " " + i, " " + (char)i, Character.getName(i));
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-12s %-11s %-15s%n", " " + i, " " + (char)i, Character.getName(i));
            }
        }
        System.out.println();

        // 8. Проверка, является ли число палиндромом
        System.out.println("8. Проверка, является ли число палиндромом");
        // int a1 = 1234321;
        int a1 = 123221;
        int reverse = 0;
        int tmp_a1 = a1;

        while (tmp_a1 > 0) {
            reverse = reverse * 10 + tmp_a1 % 10;
            tmp_a1 /= 10;
        }

        if (reverse == a1) {
            System.out.println("число " + a1 + " является палиндромом\n");
        } else {
            System.out.println("число " + a1 + " не является палиндромом\n");
        }

        // 9. Проверка, является ли число счастливым
        System.out.println("9. Проверка, является ли число счастливым");
        int a2 = 123321;
        int b1 = a2 / 1000;
        int b2 = a2 % 1000;
        int s1 = b1 / 100 + ((b1 % 100) / 10) + (b1 % 10);
        int s2 = b2 / 100 + ((b2 % 100) / 10) + (b2 % 10); 

        if (s1 == s2) {
            System.out.println("Число " + a2 + " является счастливым");   
        } else {
            System.out.println("Число " + a2 + " не является счастливым"); 
        }

        System.out.println("Сумма цифр "+ b1 + " = " 
                + s1 + ", а сумма " + b2 + " = " + s2 + "\n");

        // 10. Отображение таблицы умножения Пифагора
        System.out.println("10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
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