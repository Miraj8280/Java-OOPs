
/* ----------------------------------------------------------------------
                        2. Multilevel Inheritance 
 ------------------------------------------------------------------------*/

package Lesson04;

public class Multilevel {
    public static void main(String[] args) {
        Developer dev = new Developer("Miraj", 22, "Web");
        dev.sayDomain(); // own method (sub-class 2)
        dev.sayName(); // method of sub-class 1 (Parent of sub-class 2)
        dev.eat(); // method of parent class
    }
}

/* PARENT CLASS */
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

/* SUB-CLASS 1*/
// Student class extends the Person class i.e; now Student has all access of variables and methods inside Person.
class Student extends Person {
    public Student(String name, int age) {
        // To use the variables of the parent class i.e; Person, we need to use 'super' keyword
        super(name, age);
    }

    void sayName() {
        System.out.println("My name is: " + name);
    }

    void sayAge() {
        System.out.println("Age: " + age);
    }
}

/* SUB-CLASS 2 */
// Developer class extends the Student class i.e; now Developer has all access of variables and methods inside Student.
class Developer extends Student {
    String domain;

    public Developer(String name, int age, String domain) {
        super(name, age);
        this.domain = domain;
    }

    void sayDomain() {
        System.out.println(domain + " Developer.");
    }
}

