// Take an integer as input from the user. 
// Check if the number is divisible by 2. If it is, print that it is even; 
// otherwise, print that it is odd.

public class evenoroddcheck {
    public static void main(String[] args) {
        int number = 11; // You can change this value to test with different numbers

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}