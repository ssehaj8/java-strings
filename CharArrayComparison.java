import java.util.Scanner;

public class CharArrayComparison {

    	// Method to return all characters in a string without using toCharArray()
    	public static char[] getChars(String s) {
        	char[] chars = new char[s.length()];
        	for (int i = 0; i < s.length(); i++) {
            		chars[i] = s.charAt(i);
        	}
        	return chars;
    	}

    	// Method to compare two character arrays
    	public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        	if (arr1.length != arr2.length) {
            		return false;
        	}
        	for (int i = 0; i < arr1.length; i++) {
            		if (arr1[i] != arr2[i]) {
                		return false;
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the text: ");
        	String str = sc.nextLine();

        	// Custom method to get characters
        	char[] arr1 = getChars(str);

        	// Built-in method to get characters
        	char[] arr2 = str.toCharArray();

        	// Compare both character arrays
        	boolean areEqual = compareCharArrays(arr1, arr2);

        	System.out.println("Are both character arrays equal? " + areEqual);
	}
}
