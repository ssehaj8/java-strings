import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Accessing index beyond the length of the string
        System.out.println("Character at position 100: " + str.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Character at position 100: " + str.charAt(100));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Attempted to access an index beyond the string length");
        } 
        catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        //Generate exception
        generateException(str);

        // Handling the exception
        handleException(str);
    }
}
