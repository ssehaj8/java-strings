import java.util.Scanner;

public class TextLowerCase {

    	// Method to convert text to uppercase using charAt() and ASCII logic
    	public static String convertToLowerCase(String str) {
        	StringBuilder lowerText = new StringBuilder();
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);
            		if (ch >= 'A' && ch <= 'Z') {
				lowerText.append((char) (ch + 32));
            		} 
            		else {
                		lowerText.append(ch);
            		}
        	}
        	return lowerText.toString();
    	}

    	// Method to compare two strings character by character
    	public static boolean compareStrings(String str1, String str2) {
        	if (str1.length() != str2.length()) {
            		return false;
        	}
        	for (int i = 0; i < str1.length(); i++) {
            		if (str1.charAt(i) != str2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String str = sc.nextLine();

        	// Convert to lowercase using custom method
        	String s1 = convertToLowerCase(str);

        	// Convert to lowercase using built-in method
        	String s2 = str.toLowerCase();

        	// Compare results
        	boolean areEqual = compareStrings(s1, s2);

        	// Display results
        	System.out.println("Custom Lowercase: " + s1);
        	System.out.println("Built-in Lowercase: " + s2);
        	System.out.println("Are both results equal? " + areEqual);

    	}
} 
