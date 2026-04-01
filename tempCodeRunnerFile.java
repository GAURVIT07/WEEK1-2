
////////Question 3
import java.util.Scanner;
public class W1_2L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmToMileConversionFactor = 1.6;

        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();

        double miles = km / kmToMileConversionFactor;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close();
    }
}