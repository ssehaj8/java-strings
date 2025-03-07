import java.util.Scanner;

public class NestedLoopFrequency {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String st = sc.nextLine();

        	String[] res = findCharacterFrequencies(st);
        	displayFrequencies(res);
    	}

   	// Method to find character frequencies using nested loops
   	public static String[] findCharacterFrequencies(String st) {
        	char[] chars = st.toCharArray();
        	int[] freq = new int[chars.length];

        	for (int i = 0; i < chars.length; i++) {
            		if (chars[i] == '0') continue; // Skip already counted characters

            		freq[i] = 1;
            		for (int j = i + 1; j < chars.length; j++) {
                		if (chars[i] == chars[j]) {
                    			freq[i]++;
                    			chars[j] = '0'; // Mark duplicate characters as '0'
                		}
            		}
        	}

        	int count = 0;
        	for(int i=0;i<freq.length;i++) {
            		if (freq[i] > 0) count++;
        	}

        	String[] result = new String[count];
        	int index = 0;
        	for (int i = 0; i < chars.length; i++) {
            		if (freq[i] > 0) {
                	result[index++] = chars[i] + " - " + freq[i];
            		}
        	}

        	return result;
    	}

    	// Method to display character frequencies
    	public static void displayFrequencies(String[] res) {
        	System.out.println("Character Frequencies:");
        	for (int i=0;i<res.length;i++) {
            		System.out.println(res[i]);
        	}
    	}
} 
