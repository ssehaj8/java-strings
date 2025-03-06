import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove the character from the string
        String modifiedString = removeCharacter(input, charToRemove);

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character and append if it's not the target character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}



////input: main string: hello world    character to be removed: l
////output: heo word
