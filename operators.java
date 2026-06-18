public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10   
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (a / b)); // 0        
        
        // Relational Operators
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true        
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;  
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false     
    }
}
