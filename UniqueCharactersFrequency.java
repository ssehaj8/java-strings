import java.util.Scanner;

public class UniqueCharactersFrequency {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();
        
        	char[] uniqueChars = findUniqueCharacters(s);
        	String[][] freq = findCharacterFrequencies(s, uniqueChars);
        	
        	displayFrequencyTable(freq);
    	}

    	// Method to find unique characters in the string
    	public static char[] findUniqueCharacters(String st) {
        	char[] unique = new char[st.length()];
        	int count = 0;
        
        	for (int i = 0; i < st.length(); i++) {
            		char currentChar = st.charAt(i);
            		boolean isUnique = true;
            
            		for (int j = 0; j < count; j++) {
                		if (unique[j] == currentChar) {
                    			isUnique = false;
                    			break;
                		}
            		}
            
            		if (isUnique) {
                		unique[count++] = currentChar;
            		}
        	}
        
        	char[] result = new char[count];
        	System.arraycopy(unique, 0, result, 0, count);

        	return result;
    	}

    	// Method to find frequency of unique characters
    	public static String[][] findCharacterFrequencies(String st, char[] uniqueChars) {
        	String[][] freq = new String[uniqueChars.length][2];
        
        	for (int i = 0; i < uniqueChars.length; i++) {
            		char currentChar = uniqueChars[i];
            		int count = 0;
            	
            		for (int j = 0; j < st.length(); j++) {
                		if (st.charAt(j) == currentChar) {
                    			count++;
                		}
            		}
            
            		freq[i][0] = String.valueOf(currentChar);
            		freq[i][1] = String.valueOf(count);
        	}
        
        	return freq;
    	}

    	// Method to display frequency table
    	public static void displayFrequencyTable(String[][] arr) {
        	System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        	for (int i=0;i<arr.length;i++) {
            		System.out.printf("%-10s %-10s\n", arr[i][0], arr[i][1]);
        	}
    	}
}


/*
input: Enter a string: hello sehaj
output:
character    Frequency
h            2
e            2
l            2
o            1
             1
s            1
a            1
j            1
*/
