// voting of Eligibilty
//Ask the user for their age. If they are 18 or older,
//  print "Eligible to vote." If they are younger than 18, 
// print "Not eligible to vote."

public class votingelgibility {
    public static void main(String[] args) {
        int age = 20; // You can change this value to test with different ages

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}