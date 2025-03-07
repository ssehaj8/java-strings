import java.util.Scanner;

public class PalindromeCheck {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String st = sc.nextLine();

        	System.out.println("Logic 1: Using two-pointer approach");
        	System.out.println(TwoPointer(st) ? "Palindrome" : "Not a palindrome");

        	System.out.println("Logic 2: Using recursion");
        	System.out.println(Recursive(st, 0, st.length() - 1) ? "Palindrome" : "Not a palindrome");

        	System.out.println("Logic 3: Using character arrays");
        	System.out.println(CharArray(st) ? "Palindrome" : "Not a palindrome");
    	}
	
    	// Logic 1: Two-pointer approach
    	public static boolean TwoPointer(String st) {
        	int start = 0;
        	int end = st.length() - 1;

        	while (start < end) {
            		if (st.charAt(start) != st.charAt(end)) {
                		return false;
            		}
            	start++;
            	end--;
        	}
        	return true;
    	}

    	// Logic 2: Recursive approach
    	public static boolean Recursive(String st, int start, int end) {
        	if (start >= end) {
            		return true;
        	}
        	if (st.charAt(start) != st.charAt(end)) {
            		return false;
        	}
        	return Recursive(st, start + 1, end - 1);
    	}

    	// Logic 3: Character array comparison
    	public static boolean CharArray(String st) {
        	char[] original = st.toCharArray();
        	char[] reversed = reverseArray(original);

        	for (int i = 0; i < original.length; i++) {
            		if (original[i] != reversed[i]) {
                		return false;
            		}
        	}
        	return true;
    	}

    	// Method to reverse a character array
    	public static char[] reverseArray(char[] arr) {
        	char[] reversed = new char[arr.length];
        	for (int i = 0; i < arr.length; i++) {
            		reversed[i] = arr[arr.length - 1 - i];
        	}
        	return reversed;
    	}
}
