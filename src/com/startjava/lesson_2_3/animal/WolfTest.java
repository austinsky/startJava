package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(5);
        wolf.setColor("Белый");
        wolf.setGender("Мужской");
        wolf.setNickname("Клык");
        wolf.setWeight(15);

        System.out.println("Кличка: " + wolf.getNickname());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Цвет: " + wolf.getColor());
        System.out.println("вес: " + wolf.getWeight());
        System.out.println("пол: " + wolf.getGender() + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}