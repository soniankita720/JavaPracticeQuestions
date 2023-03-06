import java.util.*;
public class RelationalOperator { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("a and b are equal");
        } 
        if(a != b) {
            System.out.println("a and b are not equal");
        }
        if(a > b) {
            System.out.println("a is greater than b");
        }
        if(a < b) {
            System.out.println("a is lesser than b");
        }
        if(a >= b) {
            System.out.println("a is greater than equal to b");
        }
        if(a <= b) {
            System.out.println("a is lesser than equal to b");
        }
    }
}