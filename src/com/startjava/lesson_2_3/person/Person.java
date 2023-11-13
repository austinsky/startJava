package com.startjava.lesson_2_3.person;

public class Person {
    private char gender = 'М';
    private String name = "Петя";
    private int height = 180;
    private int weight = 85;
    private int age = 25;

    public void go() {
        System.out.println("Person.go(): " + name + " идет");
    }

    public void sit() {
        System.out.println("Person.sit(): " + name + " сидит");
    }

    public void run() {
        System.out.println("Person.run(): " + name + " бежит");
    }

    public void speak() {
        System.out.println("Person.speak(): " + name + " говорит");
    }

    public void learnJava() {
        System.out.println("Person.learnJava: " + name + " изучает Java");
    }
}