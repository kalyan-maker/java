//Take a number as input. 
// Determine if the number is strictly greater than zero, strictly less than zero, or exactly zero, 
// and print the corresponding result.

public class tocheckposnegorzero {
    public static void main(String[] args) {
        int number = -14; // You can change this value to test with different numbers

        if (number > 0) {
            System.out.println(number + " is strictly greater than zero.");
        } else if (number < 0) {
            System.out.println(number + " is strictly less than zero.");
        } else {
            System.out.println(number + " is exactly zero.");
        }
    }
}