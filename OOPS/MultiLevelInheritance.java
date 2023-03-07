public class MultiLevelInheritance {
    public static void main(String args[]) {
        Shark s = new Shark();
        s.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Shark extends Fish {
    void sleep() {
        System.out.println("sleeps");
    }
}