/*------------------------------------------------------------------
                        Class and Object
-------------------------------------------------------------------*/
public class Miraj {
    public static void main(String[] args) {
        // Object (instance of class)
        Person p1 = new Person();
        p1.name = "Mahir";
        p1.age = 2;
        System.out.println(p1.name + " " + p1.age);

        // Object (instance of class)
        Person p2 = new Person();
        p2.name = "Miraj";
        p2.age = 22;
        System.out.println(p2.name + " " + p2.age);
    }
}

// Class (template or blue print)
class Person {
    String name;
    int age;
}