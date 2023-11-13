package com.startjava.lesson_1.base;

public class VariableNamesTheme {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////
        ////  1. Разные переменные                           ///
        ////////////////////////////////////////////////////////
        System.out.println("1. Разные переменные");
        
        // цифра
        int digit = 5;
        System.out.println("Цифра: \t\t\t\t" + digit);

        // сумма чисел
        long sum = 5 + 6;
        System.out.println("сумма чисел: \t\t\t" + sum);
        
        // произведение цифр
        double multiplicationNumbers = 0.5 * 2.1;
        System.out.println("произведение цифр: \t\t" + multiplicationNumbers);
        
        // максимальное число
        int a = 5;
        int b = 6;
        int max = (a > b) ? a : b;
        System.out.println("максимальное число: \t\t" + max);

        // количество десятков
        short countTens = 6;
        System.out.println("количество десятков: \t\t" + countTens);

        // вес собаки
        float dogWeight = 4.2f;
        System.out.println("вес собаки: \t\t\t" + dogWeight);

        // исходное число
        int originalNumber = 10;
        System.out.println("исходное число: \t\t" + originalNumber) ;

        // процент по вкладу
        double percentDeposit = 4;
        System.out.println("процент по вкладу: \t\t" + percentDeposit);

        // (переменная хранит символ) &
        char ampersand = '&';
        System.out.println("переменная хранит символ: \t" + ampersand);

        // код ошибки
        int errorCode = -1;
        System.out.println("код ошибки: \t\t\t" + errorCode);

        // тип сообщения
        String messageType = "INFO";
        System.out.println("тип сообщения: \t\t\t" + messageType);
        
        // число нулей
        int countZeros = 3;
        System.out.println("число нулей: \t\t\t" + countZeros);
        
        // уникальное число
        int uniqueNumber = 10;
        System.out.println("уникальное число: \t\t" + uniqueNumber);
        
        // случайное число
        int randomNumber = 20;
        System.out.println("случайное число: \t\t" + randomNumber);
        
        // математическое выражение
        String mathExpression = "sin(cos(x))";
        System.out.println("математическое выражение: \t" + mathExpression);
        
        // выбор (чего-либо)
        String choiceVelocity = "КАМА";
        System.out.println("выбор велосипеда:\t\t" + choiceVelocity);
        
        // количество очков (в игре)
        int score = 1000;
        System.out.println("количество очков: \t\t" + score);
        
        // максимальная длина строки
        int maxLength = 100;
        System.out.println("максимальная длина строки: \t" + maxLength);
        
        // пункт меню
        String menuItem = "File";
        System.out.println("пункт меню: \t\t\t" + menuItem);
        
        // стоимость кофе на вынос
        int costOfCoffeeTakeaway = 100;
        System.out.println("стоимость кофе на вынос: \t" + costOfCoffeeTakeaway);
        
        // дата начала (чего-либо)
        String beginDate = "22.10.2023";
        System.out.println("дата начала занятий: \t\t" + beginDate);
        
        // окончание диапазона
        int endRange = 20;
        System.out.println("окончание диапазона: \t\t" + endRange);
        
        // полное имя работника месяца
        String fullNameEmployeeMonth = "Иванов Иван Иванович";
        System.out.println("полное имя работника месяца: \t" + fullNameEmployeeMonth);
        
        // заголовок электронной книги
        String ebookTitle = "header of my email";
        System.out.println("заголовок электронной книги: \t" + ebookTitle);
        
        // размер
        int size = 30;
        System.out.println("размер: \t\t\t" + size);
        
        // вместимость (чего-либо)
        int capacity = 25;
        System.out.println("вместимость контейнера: \t" + capacity);
        
        // счетчик
        int counter = 35;
        System.out.println("счетчик: \t\t\t" + counter);
        
        // путь до файла
        String filePath = "/tmp/Lesson1";
        System.out.println("путь до файла: \t\t\t" + filePath);
        
        // количество чисел в каждой строке
        int countNumbersPerLine = 10;
        System.out.println("количество чисел в каждой строке: " + countNumbersPerLine + "\n");

        ////////////////////////////////////////////////////////
        ////  2. boolean-переменные                          ///
        ////////////////////////////////////////////////////////

        System.out.println("2. boolean-переменные");
        // сотни равны?
        boolean isEqualHundreds = true;
        System.out.println("сотни равны?: \t\t\t\t" + isEqualHundreds);
        
        // компьютер включен?
        boolean isOnComputer = true;
        System.out.println("компьютер включен?: \t\t\t" + isOnComputer);
        
        // есть равные цифры?
        boolean isEqualDigits = true;
        System.out.println("есть равные цифры?: \t\t\t" + isEqualDigits);
        
        // (что-либо) создано?
        boolean isCreated = true;
        System.out.println("Поле создано?: \t\t\t\t" + isCreated);
        
        // (что-либо) пусто?
        boolean isEmpty = false;
        System.out.println("(что-либо) пусто?: \t\t\t" + isEmpty);
        
        // (что-либо) активный?
        boolean isActive = false;
        System.out.println("Поле активное?: \t\t\t" + isActive);
        
        // новый?
        boolean isNew = false;
        System.out.println("новый?: \t\t\t\t" + isNew);
        
        // электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("электронная почта действительная?: \t" + isValidEmail);
        
        // имеются уникальные строки?
        boolean hasUniqueStrings = true;
        System.out.println("имеются уникальные строки?: \t\t" + hasUniqueStrings + "\n");

        ////////////////////////////////////////////////////////
        ////  3. Аббревиатуры                                ///
        ////////////////////////////////////////////////////////

        System.out.println("3. Аббревиатуры");
        // старый universally unique identifier
        long oldUuid = 0x55298c02;
        System.out.println("старый universally unique identifier: \t\t\t\t0x" + String.format("%x", oldUuid));
        
        // производитель оперативной памяти
        String manufacturerRam = "Samsung";
        System.out.println("производитель оперативной памяти: \t\t\t\t" + manufacturerRam);
        
        // емкость жесткого диска
        int capacityHdd = 2000;
        System.out.println("емкость жесткого диска: \t\t\t\t\t" + capacityHdd);
        
        // протокол передачи гипертекста
        String protocol = "HTTP";
        System.out.println("протокол передачи гипертекста: \t\t\t\t\t" + protocol);
        
        // сокращенный uniform resource locator
        String shortUrl = "https://youtu.be/TtT8UNK0sGg";
        System.out.println("сокращенный uniform resource locator: \t\t\t\t" + shortUrl);
        
        // новый идентификатор клиента
        int newUserId = 15;
        System.out.println("новый идентификатор клиента: \t\t\t\t\t" + newUserId);
        
        // кодировка american standard code for information interchange
        String ascii = "ASCII";
        System.out.println("кодировка american standard code for information interchange: \t" 
                + ascii + "\n");
    } 
}