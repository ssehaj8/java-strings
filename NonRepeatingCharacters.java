import java.util.Scanner;

public class NonRepeatingCharacters{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//Take user input
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		char res = findFirstNonRepeatingChar(s);

        	if (res != 0) {
            		System.out.println(res);
        	} 
        	else {
            		System.out.println("No non-repeating character found.");
        	}
		
	}
	// Method to find the first non-repeating character
	public static char findFirstNonRepeatingChar(String str) {
        	int[] freq = new int[256]; // ASCII character set size

        	// Loop through the string to count character frequencies
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);
            		freq[ch]++;
        	}
	
        	// Loop through the string to find the first non-repeating character
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);
            		if (freq[ch] == 1) {
                		return ch;
            		}
        	}

        	// Return 0 if no non-repeating character is found

    		return 0; 
	}

}



/*
input : ffgghhklmnn
output :  k
*/
