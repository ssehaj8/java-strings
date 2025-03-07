import java.util.Scanner;

public class StringLength {

    	// Method to find the length of a string without using length() method
    	public static int findLength(String str) {
        	int count = 0;
        	try {
            		while (true) {
				// Access each character until an exception occurs
                		str.charAt(count); 
                		count++;
            		}
        	} 
        	catch (StringIndexOutOfBoundsException e) {
            		// Exception occurs when count exceeds the string length
			System.out.println("Index is out of bounds");
        	}
        	return count;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a string: ");
        	String str = sc.next();

        	// Find length using custom method
        	int l1 = findLength(str);

        	// Find length using built-in method
        	int l2 = str.length();

        	// Display the results
        	System.out.println("Length of the string (custom method): " + l1);
        	System.out.println("Length of the string (built-in method): " + l2);

        	// Compare the results
        	if (l1 == l2) {
            		System.out.println("SAME");
        	} 
		else {
            		System.out.println("DIFFERENT");
        	}
    	}
}
