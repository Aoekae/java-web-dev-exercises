package exercises;
import java.util.Scanner;

public class CalculateMilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();
        System.out.println("How much gas have you gone through (in gallons)?");
        double gasUsed = input.nextDouble();
        double milesPerGallon = milesDriven/gasUsed;
        System.out.println("Your vehicle gets " + milesPerGallon + " miles per gallon!");
    }
}
