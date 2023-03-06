import java.util.*;
public class SumNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b  =sc.nextInt();
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}