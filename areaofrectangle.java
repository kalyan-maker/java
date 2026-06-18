//Calcute the area of Rectangle 
//area = length * width

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        double length, width, area;
        Scanner scanner = new Scanner(System.in); // it takes the input
        // enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();  // it takes double value
        // enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();  // it takes double value
        // calculate the area of the rectangle
        area = length * width; // area = length * width
        // print the area of the rectangle
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
        scanner.close();
    }
}