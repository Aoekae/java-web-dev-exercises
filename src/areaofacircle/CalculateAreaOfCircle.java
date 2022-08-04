package areaofacircle;

import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        double radius = input.nextDouble();
        double pi = 3.1415926535;
        double area = Circle.getArea(radius);
    }
}
