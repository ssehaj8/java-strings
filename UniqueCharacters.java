import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String str = sc.nextLine();

        	char[] uniqueChars = findUniqueCharacters(str);

        	System.out.print("Unique characters: ");
        	for (char c : uniqueChars) {
            		// ignoring empty positions in the array
            		if (c != '\0') { 
                		System.out.print(c + " ");
            		}
    	    	}
    	}

    	// Method to find unique characters
    	public static char[] findUniqueCharacters(String st) {
        	int length = findLength(st);
        	char[] unique = new char[length];
        	int uniqueCount = 0;

        	for (int i = 0; i < length; i++) {
            		char current = st.charAt(i);
            		boolean isUnique = true;

            		for (int j = 0; j < uniqueCount; j++) {
                		if (unique[j] == current) {
                    		isUnique = false;
                    		break;
                		}
            		}

            		if (isUnique) {
                		unique[uniqueCount++] = current;
            		}
        	}

        	// Create a trimmed array of only unique characters
        	char[] result = new char[uniqueCount];
        	System.arraycopy(unique, 0, result, 0, uniqueCount);
        	return result;
    	}

    	// Method to find the length of a string without using length()
    	public static int findLength(String st) {
        	int count = 0;
        	try {
            		while (true) {
                		st.charAt(count);
                		count++;
            		}
        	} 
        	catch (IndexOutOfBoundsException e) {
            		// Reached the end of the string
            		System.out.println(e.getMessage());  
        	}
        	return count;

    	}
}

/*
Enter a string: Hello Sehaj
String index out of range: 11
Unique characters: H e l o   S a j 
*/
