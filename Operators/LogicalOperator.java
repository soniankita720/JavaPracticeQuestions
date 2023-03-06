import java.util.*;
public class LogicalOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a == b) && (a <= b)) {
            System.out.println("both condition satisfies");
        }
        if((a == b) || (a >= b)) {
            System.out.println("if either of the condition satisfies");
        }
        if(!(a == b)) {
            System.out.println("if true then false, if false then true");
        }
    }
}