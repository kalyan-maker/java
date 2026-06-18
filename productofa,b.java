// product of a & b
//Multipliaction of two numbers using *

import java.util.Scanner;

public class productofab {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in); // it takes the input
        // enter two numbers
        System.out.print("Enter  number: ");
        a = scanner.nextInt();  //it takes integer value
        b = scanner.nextInt();
        // multiply two numbers
        int product = a * b;
        // print the product of two numbers
        System.out.println("The product of a " + a + " and  b " + b + " is: " + product);
        scanner.close();
    }
}
