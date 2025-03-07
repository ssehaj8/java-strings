import java.util.Scanner;

public class ConsonanntVowelTable {

    	// Method to check if a character is a vowel, consonant, or not a letter
    	public static String checkCharacter(char ch) {
        	if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            		// Convert to lowercase if character is upper case using ASCII value
            		char lower = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
            		// Check if vowel, consonant or some other character
            		if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                		return "Vowel";
            		} 
			else {
                		return "Consonant";
            		}
        	}
        	return "Not a Letter";
    	}

    	// Method to find the character type for each character in a string
    	public static String[][] getCharacterTypes(String str) {
        	String[][] result = new String[str.length()][2];

        	for (int i = 0; i < str.length(); i++) {
            		result[i][0] = String.valueOf(str.charAt(i));
            		result[i][1] = checkCharacter(str.charAt(i));
        	}

        	return result;
    	}

    	// Method to display the 2D array of character types in a tabular format
    	public static void displayCharacterTable(String[][] arr) {
        	System.out.printf("%-10s %-15s\n", "Character", "Type");
        	for (int i=0;i<arr.length;i++) {
            		System.out.printf("%-10s %-15s\n", arr[i][0], arr[i][1]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a sentence: ");
        	String str = sc.nextLine();

        	// Get character types
        	String[][] table = getCharacterTypes(str);

        	// Display the results in a tabular format
        	displayCharacterTable(table);

    	}
}


//Input: Hi, @ I am Sehaj08
/* output:
Character  Type           
H          Consonant      
i          Vowel          
,          Not a Letter   
           Not a Letter   
@          Not a Letter   
           Not a Letter   
I          Vowel          
           Not a Letter   
a          Vowel          
m          Consonant      
           Not a Letter   
S          Consonant      
e          Vowel          
h          Consonant      
a          Vowel      
j          Consonant         
0          Not a Letter   
8          Not a Letter   
*/
