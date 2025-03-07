import java.util.Scanner;

public class TextSplit {

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
           		System.out.println("Index out of bounds");
        	}
        	return count;
    	}

    	// Method to split text into words without using split() method
    	public static String[] customSplit(String str) {
        	int length = findLength(str);
        	int spaceCount = 0;

        	// Count spaces to determine the number of words
        	for (int i = 0; i < length; i++) {
            		if (str.charAt(i) == ' ') {
                		spaceCount++;
            		}
        	}

        	//Add words to resulting array
        	String[] words = new String[spaceCount + 1];
        	int start = 0;
        	int wordIndex = 0;

        	for (int i = 0; i < length; i++) {
            		if (str.charAt(i) == ' ') {
                		words[wordIndex++] = str.substring(start, i);
                		start = i + 1;
            		}
        	}
        	// Add the last word
        	words[wordIndex] = str.substring(start); 

        	return words;
    	}

    	// Method to compare two string arrays
    	public static boolean areSame(String[] arr1, String[] arr2) {
        	if (arr1.length != arr2.length) return false;
        	for (int i = 0; i < arr1.length; i++) {
            		if (!arr1[i].equals(arr2[i])) return false;
        	}
        	return true;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a sentence: ");
        	String str = sc.nextLine();

        	// Split using custom method
        	String[] arr1 = customSplit(str);

        	// Split using built-in method
        	String[] arr2 = str.split(" ");
	
        	// Compare results
        	boolean flag = areSame(arr1, arr2);

        	// Display results
        	System.out.println("Words from custom method:");
        	for (int i=0;i<arr1.length;i++) {
            		System.out.print(arr1[i]);
        	}
		System.out.println();
        	System.out.println("Words from built-in method:");
        	for (int i=0;i<arr2.length;i++) {
            		System.out.print(arr2[i]);
        	}
		System.out.println();
        	System.out.println("Are both methods producing the same result? " + (flag ? "YES" : "NO"));
    	}
}
