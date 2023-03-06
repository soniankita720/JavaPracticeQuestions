import java.util.*;
public class UnaryOperatorPreDecrement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        b = --a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}