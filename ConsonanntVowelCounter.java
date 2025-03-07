import java.util.Scanner;

public class ConsonantVowelCounter {

    	// Method to check if a character is a vowel, consonant, or not a letter
    	public static String checkCharacter(char ch) {
        	if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            		//Convert to lowercase if character is upper case using ascii value
            		char lower = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
            		//check if vowel, consonant or some other character
            		if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                		return "Vowel";
            		} 
            		else {
                		return "Consonant";
            		}
        	}
        	return "Not a Letter";
    	}

    	// Method to count vowels and consonants in a string
    	public static int[] sol(String str) {
        	int vowels = 0, consonants = 0;

        	for (int i = 0; i < str.length(); i++) {
            		String result = checkCharacter(str.charAt(i));
            		if (result.equals("Vowel")) {
                		vowels++;
            		} 
            		else if (result.equals("Consonant")) {
                		consonants++;
            		}
        	}

        	return new int[]{vowels, consonants};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a sentence: ");
        	String str = sc.nextLine();

        	// Get counts of vowels and consonants
        	int[] freq = sol(str);

        	// Display the results
        	System.out.println("Number of vowels: " + freq[0]);
        	System.out.println("Number of consonants: " + freq[1]);
    	}
}

// input: Hello world
//output:
//Number of vowels: 3
//Number of consonants: 7 
