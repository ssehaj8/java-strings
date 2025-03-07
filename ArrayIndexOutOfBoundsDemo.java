import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    	// Method to generate ArrayIndexOutOfBoundsException without handling
    	public static void generateException(String[] names) {
        	System.out.println("Accessing element at index 10: " + names[10]); // Index out of bounds
    	}

    	// Method to demonstrate handling of ArrayIndexOutOfBoundsException
    	public static void handleException(String[] names) {
        	try {
            		System.out.println("Accessing element at index 10: " + names[10]); // Index out of bounds
        	} 
        	catch (ArrayIndexOutOfBoundsException e) {
            	System.out.println("Exception caught: Array index is out of bounds.");
        	} 
        	catch (RuntimeException e) {
            		System.out.println("A runtime exception occurred: " + e.getMessage());
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of names: ");
        	int size = sc.nextInt();
        	sc.nextLine(); // Consume newline

        	String[] names = new String[size];
        	for (int i = 0; i < size; i++) {
            		System.out.print("Enter name " + (i + 1) + ": ");
            		names[i] = sc.nextLine();
        	}

        	// Uncomment to generate unhandled exception
        	// generateException(names);

        	// Handle the exception
        	handleException(names);

    	}
}
