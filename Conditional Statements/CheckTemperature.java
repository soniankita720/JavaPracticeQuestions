import java.util.*;
public class CheckTemperature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        double temp = sc.nextDouble();
        String healthResult = (temp > 100) ? "You have fever" : "You dont have fever";
        System.out.println(healthResult);
    }
}