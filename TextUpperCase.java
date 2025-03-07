import java.util.Scanner;

public class TextUpperCase {

    	// Method to convert text to uppercase using charAt() and ASCII logic
    	public static String convertToUpperCase(String str) {
        	StringBuilder upperText = new StringBuilder();
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);
            		if (ch >= 'a' && ch <= 'z') {
                		upperText.append((char)(ch - 32));
            		} 
            		else {
                		upperText.append(ch);
            		}
        	}
        	return upperText.toString();
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

        	// Convert text using user-defined method
        	String s1 = convertToUpperCase(str);
	
        	// Convert text using built-in method
        	String s2 = str.toUpperCase();

        	// Compare the results
        	boolean areEqual = compareStrings(s1, s2);

        	// Display results
        	System.out.println("Custom Uppercase: " + s1);
        	System.out.println("Built-in Uppercase: " + s2);
        	System.out.println("Are they equal? " + areEqual);
    	}
} 
