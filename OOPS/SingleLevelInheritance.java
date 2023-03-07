public class SingleLevelInheritance {
    public static void main(String args[]) {
        Fish f = new Fish();
        f.eat();
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