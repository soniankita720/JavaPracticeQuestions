public class MethodOverloadingExample {
    public static void main(String args[]) {
        Calculation c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 3));
    }
}

class Calculation {
    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}