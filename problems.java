// read input from the user using scanner and perform addition of two numbers
import java.util.Scanner;

public class problems {
    public static void main (String[] args){
int a,b;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter  number: ");
a = scanner.nextInt();
b = scanner.nextInt();
int sum = a + b;
System.out.println("The sum of a " + a + " and  b " + b + " is: " + sum);
scanner.close();    
    }
} 