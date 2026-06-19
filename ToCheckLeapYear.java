// Take a year as input and determine if it is a leap year.
//A year is a leap year if it is divisible by 4. However, 
// if it is a century year (ending in 00, like 1900 or 2000), 
// it must also be divisible by 400 to be considered a leap year.

public class ToCheckLeapyear {
    public static void main(String[] args) {
        int year = 2026; // You can change this value to test with different years

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}