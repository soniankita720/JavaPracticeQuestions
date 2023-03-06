import java.util.*;
public class CalculatorUsingSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter case number : ");
        int num = sc.nextInt();
        switch(num) {
            case 1 : int add = a + b;
                     System.out.println("Addition : " + add);
                     break; 
            case 2 : int sub = a - b;
                     System.out.println("Subtraction : " + sub);
                     break; 
            case 3 : int mul = a * b;
                     System.out.println("Multiplication : " + mul);
                     break; 
            case 4 : int div = a / b;
                     System.out.println("Division : " + div);
                     break; 
            case 5 : int mod = a % b;
                     System.out.println("Modulus : " + mod);
                     break; 
            default : System.out.println("Invalid operation");
                      break; 
        }
    }
}