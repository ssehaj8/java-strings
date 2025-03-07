import java.util.Scanner;

public class CharacterFrequency{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                //Take user input
                System.out.print("Enter a string: ");
                String s=sc.nextLine();
                String[][] res = findCharacterFrequency(s);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i][0] + " -> " + res[i][1]);
		}

        }
        // Method to find the frequency of each character
        public static String[][] findCharacterFrequency(String str) {
                int[] freq = new int[256]; // ASCII character set size

                // Loop through the string to count character frequencies
                for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        freq[ch]++;
                }

		//Create an array to store the characters and their frequencies
		
		//find the size of the array containing character in the string
		int cnt=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]>0){
				cnt++;
			}
		}

		// Create result array
        	String[][] res = new String[cnt][2];
        	int idx = 0;

        	for (int i = 0; i < freq.length; i++) {
            		if (freq[i] > 0) {
                		res[idx][0] = String.valueOf((char) i);
                		res[idx][1] = String.valueOf(freq[i]);
                		idx++;
            		}
        	}
        	return res;

        }

}



/*
I/P -> WelcomeToBridgelabs
O/P :
B -> 1
T -> 1
W -> 1
a -> 1
b -> 1
c -> 1
d -> 1
e -> 3
g -> 1
i -> 1
l -> 2
m -> 1
o -> 2
r -> 1
s -> 1

*/
