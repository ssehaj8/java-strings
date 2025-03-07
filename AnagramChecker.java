import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the first text: ");
        	String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        	System.out.print("Enter the second text: ");
        	String s2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        	if (areAnagrams(s1, s2)) {
            		System.out.println("The texts are anagrams.");
        	} 
		else {
            		System.out.println("The texts are not anagrams.");
        	}
    	}

    	// Method to check if two texts are anagrams
    	public static boolean areAnagrams(String s1, String s2) {
        	if (s1.length() != s2.length()) {
            		return false;
        	}

        	int[] freq = new int[256];

        	for (int i = 0; i < s1.length(); i++) {
            		freq[s1.charAt(i)]++;
            		freq[s1.charAt(i)]--;
        	}

        	for (int i=0;i<freq.length;i++) {
            		if (freq[i] != 0) {
                		return false;
            		}
        	}

		return true;
	}
} 
