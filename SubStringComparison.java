import java.util.Scanner;

public class SubStringComparison {

    	// Method to create a substring using charAt()
    	public static String customSubstring(String st, int s, int e) {
        	StringBuilder result = new StringBuilder();
        	for (int i = s; i < e && i < st.length(); i++) {
            		result.append(st.charAt(i));
        	}
        	return result.toString();
    	}

    	// Method to compare two strings using charAt()
    	public static boolean compareStrings(String s1, String s2) {
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

        	System.out.print("Enter a string: ");
        	String str = sc.next();

        	System.out.print("Enter start index: ");
        	int start = sc.nextInt();

        	System.out.print("Enter end index: ");
        	int end = sc.nextInt();
	
        	// Custom substring
        	String s1 = customSubstring(str, start, end);

        	// Built-in substring
        	String s2 = str.substring(start, end);

        	System.out.println("Custom Substring: " + s1);
        	System.out.println("Built-in Substring: " + s2);

        	// Comparing the results
        	if (compareStrings(s1, s2)) {
        		System.out.println("The substrings match.");
        	} 
        	else {
            		System.out.println("The substrings do not match.");
        	}
    	}
}

