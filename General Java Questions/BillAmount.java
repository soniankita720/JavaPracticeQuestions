import java.util.*;
public class BillAmount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser : ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float finalTotal = total + total * 0.18f;
        System.out.println("Bill Amount : " + finalTotal);
    }
}