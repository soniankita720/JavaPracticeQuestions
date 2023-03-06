import java.util.*;
public class CheckPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2) {
            System.out.println("Prime number");
        } else {
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
        }
        if(isPrime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
}