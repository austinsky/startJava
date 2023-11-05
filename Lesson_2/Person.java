public class Person {
    private char gender = 'М';
    private String name = "Петя";
    private int height = 180;
    private int weight = 85;
    private int age = 25;

    public void go() {
        System.out.println("Person.go(): " + name + " идет");
    }

    public void seat() {
        System.out.println("Person.seat(): " + name + " сидит");
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