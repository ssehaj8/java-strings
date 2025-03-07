import java.util.Scanner;

public class TrimSpaces {

    	// Method to find start and end indexes without leading and trailing spaces
    	public static int[] findTrimIndexes(String str) {
        	int start = 0, end = str.length() - 1;

        	// Find the start index of non-space character
        	while (start <= end && str.charAt(start) == ' ') {
            		start++;
        	}

        	// Find the end index of non-space character
        	while (end >= start && str.charAt(end) == ' ') {
            		end--;
        	}

        	return new int[]{start, end};
    	}

    	// Method to create substring using charAt() method
    	public static String getSubstring(String str, int start, int end) {
        	StringBuilder sb = new StringBuilder();
        	for (int i = start; i <= end; i++) {
            		sb.append(str.charAt(i));
        	}
        	return sb.toString();
    	}

    	// Method to compare two strings using charAt() method
    	public static boolean compareTrim(String s1, String s2) {
        	if (s1.length() != s2.length()) return false;
        	for (int i = 0; i < s1.length(); i++) {
            		if (s1.charAt(i) != s2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a sentence with leading and trailing spaces: ");
        	String str = sc.nextLine();

        	// Find start and end indexes for trimming
        	int[] indexes = findTrimIndexes(str);

        	// Get trimmed string using custom method
        	String s1 = getSubstring(str, indexes[0], indexes[1]);

        	// Get trimmed string using built-in trim() method
        	String s2 = str.trim();

        	// Compare the results
        	boolean areEqual = compareTrim(s1, s2);

		System.out.println("Input: [" + str + "]");
        	// Display the results
        	System.out.println("Custom: [" + s1 + "]");
        	System.out.println("Built-in: [" + s2 + "]");
        	System.out.println("Are both equal? " + areEqual);

    }
}

//input:       Welcome to bridgelabs  .        
/* output: 
Input: [      Welcome to bridgelabs  .       ] 
Custom: [Welcome to bridgelabs  .]
Built-in: [Welcome to bridgelabs  .]
Are both equal? true
*/
