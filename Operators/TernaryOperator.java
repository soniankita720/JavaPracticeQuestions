import java.util.*;
public class TernaryOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String value = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(value);
    }
}