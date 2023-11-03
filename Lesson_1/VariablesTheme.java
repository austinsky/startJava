public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int countCores = 4;
        long networkSpeedAdapter = 1000;
        byte capacitySsd = 127;
        short capacityRam = 16;
        float capacityVram = 2;
        double cpuFrequency = 1.8;
        boolean isOnComputer = false;

        // единица измерения Мега
        char unitMega = 'M';

        // единица измерения Гига
        char unitGiga = 'G'; 

        System.out.println("Количество ядер процессора: \t\t\t" + countCores + "\n"
                + "Скорость сетевого соединения (сетевой адаптер): "  
                + networkSpeedAdapter + unitMega + "\n"
                + "Емкость жесткого диска: \t\t\t" + capacitySsd  + unitMega + "\n"
                + "Объем оперативной памяти: \t\t\t" + capacityRam  + unitGiga + "\n"
                + "Объем видеопамяти: \t\t\t\t" + capacityVram  + unitGiga + "\n"
                + "Частота процессора: \t\t\t\t" + cpuFrequency  + unitMega + "\n"
                + "Включен компьютер?: \t\t\t\t" + ((isOnComputer) ? "да" : "нет" ) + "\n\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = 0.11;
        int allPrice = priceBook + pricePen;
        System.out.println("общая стоимость товаров без скидки: \t" + allPrice + "\n"
                + "сумма скидки: \t\t\t\t" + (allPrice * discount) + "\n"
                + "общая стоимость товаров со скидкой: \t" 
                + (priceBook + pricePen) * (1.0 - discount) + "\n\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n"                                                  
                + "   J   a a  v   v  a a\n"                                                 
                + "J  J  aaaaa  V V  aaaaa\n"                                                
                + " JJ  a     a  V  a     a" + "\n\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        int maxInt = Integer.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("Integer: src = " + maxInt + " min = " + (++maxInt) 
                + " max = " + (--maxInt) + "\n"
                + "Char: src = " + (int)maxChar + " min = " + ((int) ++maxChar) 
                + " max = " + ((int) --maxChar) + "\n"
                + "Byte: src = " + maxByte + " min = " + (++maxByte) 
                + " max = " + (--maxByte) + "\n"
                + "Long: src = " + maxLong + " min = " + (++maxLong) 
                + " max = " + (--maxLong) + "\n"
                + "Short: src = " + maxShort + " min = " + (++maxShort) 
                + " max = " + (--maxShort) + "\n\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        // с помощью третьей переменной
        System.out.println("с помощью третьей переменной\n"
                + "исходные значения переменных: a = " + a + " b = " + b);
        int c = a; 
        a = b; 
        b = c;
        System.out.println("новые значения переменных: a = " + a + " b = " + b + "\n");

        // с помощью арифметических операций
        System.out.println("с помощью арифметических операций\n"
                + "исходные значения переменных: a = " + a + " b = " + b);
        a += b; 
        b = a - b; 
        a -= b;
        System.out.println("новые значения переменных: a = " + a + " b = " + b + "\n");
        
        // с помощью побитовой операции
        System.out.println("с помощью побитовой операции ^\n"
                + "исходные значения переменных: a = " + a + " b = " + b);
        a ^= b; 
        b ^= a; 
        a ^= b;
        System.out.println("новые значения переменных: a = " + a + " b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar      = '$';    // (char)36;
        char asterisk    = '*';    // (char)42;
        char atSign      = '@';    // (char)64; 
        char verticalBar = '|';    // (char)124;
        char tilde       = '~';    // (char)126;
        System.out.println((int) dollar + ": \t" + dollar + "\n"
                + (int) asterisk + ": \t" + asterisk + "\n"
                + (int) atSign + ": \t" + atSign + "\n"
                + (int) verticalBar + ": \t" + verticalBar + "\n"
                + (int) tilde + ": \t" + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        final char slash            = '/';
        final char backslash        = '\\';
        final char leftParenthesis  = '(';
        final char rightParenthesis = ')';
        final char underscore       = '_';

        System.out.println("    " + slash + backslash + " \n"
                + "   " + slash + "  " + backslash + "\n"
                + "  " + slash + backslash + leftParenthesis + " "
                + rightParenthesis + backslash + "\n"
                + " " + slash + "      " + backslash + "\n"
                + "" + slash + underscore + underscore + underscore + underscore + slash 
                + backslash + underscore + underscore + backslash + " \n");

        // System.out.println("    /\\ ");
        // System.out.println("   /  \\");
        // System.out.println("  /_( )\\");
        // System.out.println(" /      \\");
        // System.out.println("/____/\\__\\");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100; 
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println("Число N содержит:\n"
                + "    сотен - " + hundreds + "\n"
                + "    десятков - " + tens + "\n"
                + "    единиц - " + ones + "\n"
                + "Сумма его цифр = " + (hundreds + tens + ones) + "\n"
                + "Произведение = " + (hundreds * tens * ones) + "\n");

        System.out.println("9. Вывод времени");
        int numSeconds = 86399;
        int hours = numSeconds / 3600; // (60 * 60);
        int minutes = (numSeconds % 3600) / 60;
        int seconds = numSeconds %  60; 
        // System.out.println(hours + ":" +  minutes + ":" + seconds); 
        System.out.printf("%02d:%02d:%02d\n\n", hours, minutes, seconds);
    }
}
