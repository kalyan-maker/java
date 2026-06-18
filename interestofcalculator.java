//Write a program to calculate Simple Interest. 
// /Ask the user to input the Principal amount ($P$), 
// the Rate of interest ($R$), and the Time period in years ($T$).

import java.util.Scanner;

public class interestofCalculator {
    public static void main(String[] args) {
        double P, R, T, SI;
        Scanner scanner = new Scanner(System.in); // it takes the input
        // enter the Principal amount
        System.out.print("Enter the Principal amount (P): ");
        P = scanner.nextDouble();  // it takes double value
        // enter the Rate of interest
        System.out.print("Enter the Rate of interest (R): ");
        R = scanner.nextDouble();  // it takes double value
        // enter the Time period in years
        System.out.print("Enter the Time period in years (T): ");
        T = scanner.nextDouble();  // it takes double value
        // calculate the Simple Interest
        SI = (P * R * T) / 100; // SI = (P * R * T) / 100
        // print the Simple Interest
        System.out.println("The Simple Interest for Principal amount " + P + ", Rate of interest " + R + "%, and Time period " + T + " years is: " + SI);
        scanner.close();
    }
}
