public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        final int MALE = 1;
        final int FEMALE = 2;

        int gender = MALE;

        if (gender != MALE) {
            System.out.println("не мужской пол");
        } else {
            System.out.println("мужской пол");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Возраст старше 18 лет");
        } else {
            System.out.println("Возраст 18 лет или младше");
        }

        char firstCharacterName = "Michail".charAt(0);
        if (firstCharacterName == 'M') {
            System.out.println("Ваше имя начинается с буквы M");
        } else if (firstCharacterName == 'I') {
            System.out.println("Ваше имя начинается с буквы I");
        } else {
            System.out.println("Ваше имя начинается с буквы " + firstCharacterName);
        }
        System.out.println();

        // 2. Поиск большего числа
        System.out.println("2. Поиск большего числа");
        int a = 3, b = 3;
        // int a = 5, b = 3;
        System.out.println("Исходные числа: " + a + ", " + b);
        if (a == b) {
            System.out.println("числа равны");
        } else {
            System.out.println("" + ((a > b) ? a : b) + " больше числа " + ((a > b) ? b : a));
        }
        System.out.println();

        // 3. Проверка числа
        System.out.println("3. Проверка числа");
        int c = 5;
        if (c == 0) {
            System.out.println("Число ноль");
        } else {
            if (c >= 0) {
                System.out.print("число " + c + " является положительным");
            } else {
                System.out.print("число " + c + " является отрицательным");
            }

            if (c % 2 == 0) {
                System.out.println(" и четным");
            } else {
                System.out.println(" и нечетным");
            }
        }
        System.out.println();

        // 4. Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах");
        int a1 = 123, a2 = 223;
        int hundreds1 = a1 / 100;
        int hundreds2 = a2 / 100;
        int tens1 = (a1 % 100) / 10;
        int tens2 = (a2 % 100) / 10;
        int ones1 = a1 % 10;
        int ones2 = a2 % 10;
        int countEquals = 0; // количество совпадений
        System.out.println("Исходные числа: a1 = " + a1 + ", a2 = " + a2);
        if (hundreds1 == hundreds2) {
            System.out.println("Совпадают сотни - " + hundreds1);
            ++countEquals;
        }

        if (tens1 == tens2) {
            System.out.println("Совпадают десятки - " + tens1);
            ++countEquals;
        }

        if (ones1 == ones2) {
            System.out.println("Совпадают единицы - " + ones1);
            ++countEquals;
        }

        if (countEquals == 0) {
            System.out.println("Отсутствует совпадение чисел в разрядах");
        }
        System.out.println();

        // 5. Определение символа по его коду
        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057'; 
        // char symbol = '\u005e';
        // char symbol = '\u0031';
        if (symbol >= '\u0061' && symbol <= '\u007a') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= '\u0041' && symbol <= '\u005a') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= '\u0030' && symbol <= '\u0039') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не является не буквой и не цифрой");
        }
        System.out.println();

        // 6. Подсчет суммы вклада и начисленных банком %
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int amount = 301_000;
        double deposit = 0;
        if (amount < 100000) {
            deposit = amount * 0.05; // 5% это 5 / 100 = 0.05
        } else if (amount >= 100_000 && amount < 300000) {
            deposit = amount * 0.07; 
        } else if (amount > 300000) {
            deposit = amount * 0.1;
        } 
        System.out.println("сумма вклада - " + amount + "\n"
                + "сумма начисленного % - " + deposit + "\n"
                + "итоговая сумма с % - " + (amount + deposit) + "\n");

        // 7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");
        int historyGrade = 59;
        int programmingGrade = 92;
        int avgGrade = (historyGrade + programmingGrade) / 2;
        int historyScore = 0, programmingScore = 0;

        if (historyGrade <= 60) {
            System.out.println("История - 2");
            historyScore = 2;
        } else if (historyGrade > 91 ) {
            System.out.println("История - 5");
            historyScore = 5;
        } else if (historyGrade > 73 ) {
            System.out.println("История - 4");
            historyScore = 4;
        } else if (historyGrade > 60 ) {
            System.out.println("История - 3");
            historyScore = 3;
        } 

        if (programmingGrade <= 60) {
            System.out.println("Программирование - 2");
            programmingScore = 2;
        } else if (programmingGrade > 91 ) {
            System.out.println("Программирование - 5");
            programmingScore = 5;
        } else if (programmingGrade > 73 ) {
            System.out.println("Программирование - 4");
            programmingScore = 4;
        } else if (programmingGrade > 60 ) {
            System.out.println("Программирование - 3");
            programmingScore = 3;
        } 

        int avgScore = (historyScore + programmingScore) / 2;

        System.out.println("средний балл оценок по предметам - " + avgScore + "\n"
                + "средний % по предметам " + avgGrade + "\n");

        // 8. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли");
        // ежемусячные продажи
        int priceProduct = 13000;  
        
        // Аренда
        int rent = 5000;     

        // Себестоимость товара
        int costProduct = 9000;  

        int profit = 12 * (priceProduct - rent - costProduct);

        if (profit == 0) {
            System.out.println("Прибыль за год: 0");
        } else if (profit > 0 ) {
            System.out.println("Прибыль за год: +" + profit);
        } else if (profit < 0 ) {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println();
    }
}