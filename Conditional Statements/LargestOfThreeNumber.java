import java.util.*;
public class LargestOfThreeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c) {
            System.out.println("a is greater");
        } else if(b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}