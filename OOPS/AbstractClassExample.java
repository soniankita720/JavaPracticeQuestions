public class AbstractClassExample {
    public static void main(String args[]) {
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal {
    String color;
    Animal() {
        color = "Brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Chicken extends Animal{
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

class Horse extends Animal{
    void walk() {
        System.out.println("walks on 4 legs");
    }
}