package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mark1 = new Jaeger();
        mark1.setModelName("Brawler Yukon");
        mark1.setMark("Mark-1");
        mark1.setOrigin("USA");
        mark1.setHeight(280f);
        mark1.setWeight(2.412f);
        mark1.setSpeed(2);
        mark1.setStrenght(10);
        mark1.setArmor(20);
        mark1.drigt();

        Jaeger mark5 = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);
        mark5.move();
        System.out.println("\nИнформация о модели до изменения: " + mark1);
        mark1.setArmor(30);
        System.out.println("Информация о модели после изменения: " + mark1);
        System.out.println(mark5);
    }
}