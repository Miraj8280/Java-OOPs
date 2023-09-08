/* ----------------------------------------------------------------------------
                            Polymorphism
 ------------------------------------------------------------------------------*/


package Lesson02;

public class Polymorphism {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Mahir";
        p1.age = 2;

        Person p2 = new Person();
        p2.name = "Miraj";
        p2.age = 22;

        p1.walk();
        p2.walk(10);
    }
}

class Person {
    String name;
    int age;

    // Same method but different in arguments
    void walk() {
        System.out.println(name + " is walking.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }
}