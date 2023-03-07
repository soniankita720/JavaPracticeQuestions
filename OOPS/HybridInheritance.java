public class HybridInheritance {
    public static void main(String args[]) {
        Shark s = new Shark();
        s.eat();
        Pug p = new Pug();
        p.eat();
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

class Shark extends Fish {
    void sharkswim() {
        System.out.println("Shark swims");
    }
}

class GoldenFish extends Fish {
    void goldenfishswim() {
        System.out.println("Golden Fish swims");
    }
}

class Pug extends Dog {
    void pugsleep() {
        System.out.println("pug sleeps");
    }
}

class BullDog extends Dog {
    void bulldogsleep() {
        System.out.println("bull dog sleeps");
    }
}
