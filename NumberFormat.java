import java.util.Scanner;

public class NumberFormat {

    	// Method to generate NumberFormatException
    	public static void generateException(String str) {
        	// This will throw NumberFormatException if text is not a valid number
        	int number = Integer.parseInt(str);
        	System.out.println("Converted number: " + number);
    	}

    	// Method to handle NumberFormatException
    	public static void handleException(String str) {
        	try {
            		int number = Integer.parseInt(str);
            		System.out.println("Converted number: " + number);
        	} 
        	catch (NumberFormatException e) {
            		System.out.println("NumberFormatException occurred: Invalid number format");
        	} 
        	catch (Exception e) {
            		System.out.println("A general exception occurred: " + e.getMessage());
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a number: ");
        	String str = sc.next();

      		// Uncomment to see the unhandled exception
      
      		// Generate the exception (unhandled)
        	//generateException(str); 

        	// Handle the exception
        	handleException(str);
    	}
}
