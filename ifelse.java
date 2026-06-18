// This is a simple Java program that demonstrates the use of if-else statements. The program checks a condition and executes different blocks of code based on whether the condition is true or false.
// largest three numbers

public class ifelse {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 60;
        int num3 = 45;

        if (num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }  
        if (num2 > num1){
            if(num2 > num3){
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
        if  (num3 > num1){
            if(num3 > num2){
                System.out.println(num3 + " is the largest number.");
            } else {
                System.out.println(num2 + " is the largest number.");
            }       
        
        }
    }
}

