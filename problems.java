// read input from the user using scanner and perform addition of two numbers
import java.util.Scanner;

public class problems {
    public static void main (String[] args){
int a,b;
Scanner scanner = new Scanner(System.in); // it takes the input
// enter two numbers
System.out.print("Enter  number: ");
a = scanner.nextInt();  //it takes integer value
b = scanner.nextInt();
// add two numbers
int sum = a + b;
// print the sum of two numbers
System.out.println("The sum of a " + a + " and  b " + b + " is: " + sum);
scanner.close();    
    }
} 

