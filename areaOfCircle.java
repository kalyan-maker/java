// Area of circle
// calcute the area of circle using the formula:area = pi * r^2
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        double r, area;
        final double pi = 3.14159; // constant value of pi
        Scanner scanner = new Scanner(System.in); // it takes the input
        // enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        r = scanner.nextDouble();  // it takes double value
        // calculate the area of the circle
        area = pi * r * r; // area = pi * r^2
        // print the area of the circle
        System.out.println("The area of the circle with radius " + r + " is: " + area);
        scanner.close();
    }
}