import java.util.Scanner;

public class sumofnumbers {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner is used to take input

        System.out.print("Enter an integer: ");
        int kalyan = scanner.nextInt(); // it takes integer value
        System.out.println(kalyan);

        scanner.nextLine(); // consume the remaining newline after nextInt

        System.out.print("Enter a string: ");
        String raju = scanner.nextLine();
        System.out.println(raju);

        scanner.close();
     }
}
