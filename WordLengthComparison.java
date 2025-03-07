import java.util.Scanner;

public class WordLengthComparison {

    	// Method to find the length of a string without using length() method
    	public static int findLength(String str) {
        	int count = 0;
		try {
            		while (true) {
                		str.charAt(count); // Access each character until an exception occurs
                		count++;
            		}
        	} 
		catch (IndexOutOfBoundsException e) {
            		return count;
        	}
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

	//method to find shortest and longest words
	public static String[] findShortestAndLongest(String[][] wordLengths) {
        	if (wordLengths.length == 0) return new String[]{"", ""};

        	String shortest = wordLengths[0][0];
        	String longest = wordLengths[0][0];

        	for (int i = 1; i < wordLengths.length; i++) {
            		if (findLength(wordLengths[i][0]) < findLength(shortest)) {
                		shortest = wordLengths[i][0];
            		}
            		if (findLength(wordLengths[i][0]) > findLength(longest)) {
                		longest = wordLengths[i][0];
            		}
        	}

        	return new String[]{shortest, longest};
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

		// Find and display shortest and longest words
        	String[] res = findShortestAndLongest(arr);
        	System.out.println("\nShortest word: " + res[0]);
        	System.out.println("Longest word: " + res[1]);
    	}
}

// I/P -> Hi I am Sehaj
// O/P ->
//Word            Length
//Hi              2
//I               1
//am              2
//Sehaj           5

//Shortest word: I
//Longest word: Sehaj
