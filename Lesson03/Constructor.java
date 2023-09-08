package Lesson03;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name + " " + p1.age); // Miraj 22

        Person p2 = new Person("Mahir", 2);
        System.out.println(p2.name + " " + p2.age); // Mahir 2
    }
}

class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Miraj";
        age = 22;
    }

    // Parameterized constructor
    public Person(String myName, int myAge) {
        this.name = myName;
        this.age = myAge;
    }
}