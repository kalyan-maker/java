// largest of three numbers

public class LargestofThree {
    public static void main(String[] args) {
        // interger values
        int a = 30, b=50, c=60;

        // if else statement to find the largest number
        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        }
        if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        }
        if(c > a && c > b) {
            System.out.println(c + " is the largest number.");
        }
    }
}