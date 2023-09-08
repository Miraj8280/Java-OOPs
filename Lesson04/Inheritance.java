/* ----------------------------------------------------------------------------
                    Inheritance
-------------------------------------------------------------------------------
There are three types of inheritance:
1. Single Inheritance 
2. Multilevel Inheritance
3. Hierarchical Inheritance
*/

package Lesson04;

public class Inheritance {
    public static void main(String[] args) {
        Student std = new Student("Khusbu", 21);
        std.sayName();
        std.eat(); // accessing from parent class
    }
}

/* ----------------------------------------------------------------------
                        1. Single Inheritance 
 ------------------------------------------------------------------------*/

class Person {
    String name;
    int age;

    public Person(String myName, int myAge) {
        this.name = myName;
        this.age = myAge;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Student class extends the Person class i.e; now Student has all access of variables and methods inside Person.
class Student extends Person {
    public Student(String name, int age) {
        // To use the variables of the parent class i.e; Person, we need to use 'super' keyword
        super(name, age);
    }

    void sayName() {
        System.out.println("My name is: "+ name);
    }
}
