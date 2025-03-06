import java.util.*;
  public class VowelsCharaters{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      
      //input the string
      System.out.print("Enter a String: ");
      String str = sc.nextLine();

      //initilize vowels and consonants
      int vowels=0;
      int consonants=0;

      // Define vowels
      String vowelsList= "aeiou";
      
      //check each chatarcter
       for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if character is a letter
                if (vowelsList.indexOf(ch) != -1) {
                    vowels++; // If character is in vowelsList, count as vowel
                } else {
                    consonants++; // Otherwise, count as consonant
                }
            }
        }
        
       //output
       System.out.println("Number of vowels: "+ vowels);
       System.out.println("Number of consonants: "+ consonants);

     }
   }



//// input = hello 
////output= number of vowels: 2, number of consonants:3
