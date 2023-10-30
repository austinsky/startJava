public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int countCores = 4;
        long networkSpeedAdapter = 1000;
        byte capacityHardDrive = 127;
        short memory = 16;
        float videoMemory = 2;
        double processorFrequency = 1.8;
        boolean isOnComputer = false;
        char unitMega = 'M'; // единица измерения Мега
        char unitGiga = 'G'; // единица измерения Гига

        System.out.println("Количество ядер процессора: \t\t\t" + countCores);
        System.out.println("Скорость сетевого соединения (сетевой адаптер): " + networkSpeedAdapter 
                                     + unitMega);
        System.out.println("Емкость жесткого диска: \t\t\t" + capacityHardDrive  + unitMega);
        System.out.println("Объем оперативной памяти: \t\t\t" + memory  + unitGiga);
        System.out.println("Объем видеопамяти: \t\t\t\t" + videoMemory  + unitGiga);
        System.out.println("Частота процессора: \t\t\t\t" + processorFrequency  + unitMega);
        System.out.println("Включен компьютер?: \t\t\t\t" + ((isOnComputer == true) ? "да" : "нет" ));
        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = 0.11;
        System.out.println("общая стоимость товаров без скидки: \t" + (priceBook + pricePen));
        System.out.println("сумма скидки: \t\t\t\t" + (priceBook + pricePen)*(discount));
        System.out.println("общая стоимость товаров со скидкой: \t" 
                                        + (priceBook + pricePen)*(1.0 - discount));
        System.out.println();

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов");
        int maxInt = Integer.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("Integer: min = " + (++maxInt) + " max = " + (--maxInt));
        System.out.println("Char: min = " + Integer.valueOf(++maxChar) 
                                                        + " max = " + Integer.valueOf(--maxChar));
        System.out.println("Byte: min = " + (++maxByte) + " max = " + (--maxByte));
        System.out.println("Long: min = " + (++maxLong) + " max = " + (--maxLong));
        System.out.println("Short: min = " + (++maxShort) + " max = " + (--maxShort));
        System.out.println();

        System.out.println("5. Перестановка значений переменных");
        int a = 2, b = 5;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: a = " + a + " b = " + b);
        int c = a; a = b; b = c;
        System.out.println("новые значения переменных: a = " + a + " b = " + b);
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: a = " + a + " b = " + b);
        a = a + b; b = a - b; a = a - b;
        System.out.println("новые значения переменных: a = " + a + " b = " + b);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("исходные значения переменных: a = " + a + " b = " + b);
        a = a ^ b; b = a ^ b; a = a ^ b;
        System.out.println("новые значения переменных: a = " + a + " b = " + b);
        System.out.println();

        System.out.println("6. Вывод символов и их кодов");
        char ch1 = (char)36;
        char ch2 = (char)42;
        char ch3 = (char)64; 
        char ch4 = (char)124;
        char ch5 = (char)126;
        System.out.println(String.valueOf(Integer.valueOf(ch1)) + ": \t" + ch1);
        System.out.println(String.valueOf(Integer.valueOf(ch2)) + ": \t" + ch2);
        System.out.println(String.valueOf(Integer.valueOf(ch3)) + ": \t" + ch3);
        System.out.println(String.valueOf(Integer.valueOf(ch4)) + ": \t" + ch4);
        System.out.println(String.valueOf(Integer.valueOf(ch5)) + ": \t" + ch5);
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char inverseSlash = '\\';
        char parenthesis = '(';
        char inverseParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + inverseSlash + " ");
        System.out.println("   " + slash + "  " + inverseSlash);
        System.out.println("  " + slash + underscore + parenthesis + " " 
                                        + inverseParenthesis + inverseSlash);
        System.out.println(" " + slash + "      " + inverseSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash 
                                    + inverseSlash + underscore + underscore + inverseSlash);

        // System.out.println("    /\\ ");
        // System.out.println("   /  \\");
        // System.out.println("  /_( )\\");
        // System.out.println(" /      \\");
        // System.out.println("/____/\\__\\");
                                                                                                                                                                                                                                                     
        System.out.println();

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100; 
        int tens = (num % 100) / 10;
        int units = num % 10;
        System.out.println("Число N содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + units);
        System.out.println("Сумма его цифр = " + (hundreds + tens + units));
        System.out.println("Произведение = " + (hundreds * tens * units));
        System.out.println();

        System.out.println("9. Вывод времени");
        int numSeconds = 86399;
        int hours = numSeconds / (60 * 60);
        int minutes = (numSeconds % (60 * 60)) / 60;
        int seconds = numSeconds %  60; 
        // System.out.println(hours + ":" +  minutes + ":" + seconds); 
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
        System.out.println();
    }
}
