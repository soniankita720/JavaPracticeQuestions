public class HierarchicalInheritance {
    public static void main(String args[]) {
        Fish f = new Fish();
        f.eat();
        Dog d = new Dog();
        d.eat();
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

class Dog extends Animal {
    void sleep() {
        System.out.println("sleeps");
    }
}