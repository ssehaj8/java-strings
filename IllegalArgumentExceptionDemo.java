import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    	// Method to generate IllegalArgumentException
    	public static void generateException(String str, int start, int end) {
        	// This will cause an IllegalArgumentException if start > end
        	String sub = str.substring(start, end);
        	System.out.println("Substring: " + sub);
    	}

    	// Method to handle IllegalArgumentException
    	public static void handleException(String str, int start, int end) {
        	try {
            		String sub = str.substring(start, end);
            		System.out.println("Substring: " + sub);
        	} 
        	catch (IllegalArgumentException e) {
            		System.out.println("IllegalArgumentException caught: " + e.getMessage());
        	} 
        	catch (Exception e) {
            		System.out.println("General Exception caught: " + e.getMessage());
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String str = sc.nextLine();

        	System.out.print("Enter start index: ");
        	int start = sc.nextInt();

        	System.out.print("Enter end index: ");
        	int end = sc.nextInt();

        	// generate the exception without handling
        	generateException(str, start, end);

        	// Handling the exception
        	handleException(str, start, end);
    	}
}
