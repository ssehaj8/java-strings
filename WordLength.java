import java.util.Scanner;

public class WordLength {

    	// Method to find the length of a string without using length() method
    	public static int findLength(String str) {
        	int count = 0;
        	try {
            		while (true) {
                		str.charAt(count); // Access each character until an exception occurs
                		count++;
            		}
        	} 
        	catch (StringIndexOutOfBoundsException e) {
			//error is caught
        	}
        	return count;
    	}

    	// Method to split text into words without using split() method
    	public static String[] splitWords(String str) {
        	int length = findLength(str);
        	int spaceCount = 0;

        	// Count the number of spaces to determine word count
        	for (int i = 0; i < length; i++) {
            		if (str.charAt(i) == ' ') {
                		spaceCount++;
            		}
        	}

        	String[] words = new String[spaceCount + 1];
        	int start = 0;
        	int idx = 0;

        	for (int i = 0; i < length; i++) {
            		if (str.charAt(i) == ' ') {
                		words[idx++] = str.substring(start, i);
                		start = i + 1;
            		}
        	}
        	// Add the last word
        	words[idx] = str.substring(start); 

        	return words;
    	}

    	// Method to return a 2D array with words and their lengths
    	public static String[][] getWordLength(String[] words) {
        	String[][] table = new String[words.length][2];

        	for (int i = 0; i < words.length; i++) {
            		table[i][0] = words[i];
            		table[i][1] = String.valueOf(findLength(words[i]));
        	}

        	return table;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a sentence: ");
        	String str = sc.nextLine();

        	// Split words
        	String[] words = splitWords(str);

        	// Get word-length table
        	String[][] arr = getWordLength(words);

        	// Display results in tabular format
        	System.out.printf("%-15s %s\n", "Word", "Length");
        	for (int i=0;i<arr.length;i++) {
            		System.out.printf("%-15s %d\n", arr[i][0], Integer.parseInt(arr[i][1]));
        	}
    	}
}

// Input: Hi I am Sehaj
// Output:
//Word            Length
//Hi              2
//I               1
//am              2
//Sehaj           5
