import java.util.Scanner;

public class StringComparion {

    	// Method to compare two strings using charAt()
    	public static boolean compareStringsCharAt(String s1, String s2) {
        	if (s1.length() != s2.length()) {
            		return false;
        	}
        	for (int i = 0; i < s1.length(); i++) {
            		if (s1.charAt(i) != s2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking user input for two strings
        	System.out.print("Enter first string: ");
        	String s1 = sc.next();
	
        	System.out.print("Enter second string: ");
        	String s2 = sc.next();

        	// Comparing using custom method
        	boolean res1 = compareStringsCharAt(s1, s2);
	
        	// Comparing using built-in equals method
        	boolean res2 = s1.equals(s2);

        	// Displaying results
        	System.out.println("Comparison using charAt(): " + res1);
        	System.out.println("Comparison using equals(): " + res2);

        	// Checking if results match
        	System.out.println("Both methods give the same result: " + (res1 == res2));
    	}
}
