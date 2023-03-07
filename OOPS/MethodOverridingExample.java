public class MethodOverridingExample {
    public static void main(String args[]) {
        Cow c = new Cow();
        c.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Cow extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}