import java.util.*;
public class ProductNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b  =sc.nextInt();
        int product = a * b;
        System.out.println("Product : " + product);
    }
}