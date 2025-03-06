import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle case of each character
        String result = toggleCase(input);

        // Output the modified string
        System.out.println("String after toggling case: " + result);
    }

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        // Iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is uppercase, convert to lowercase
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } 
            // If the character is lowercase, convert to uppercase
            else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } 
            // Non-alphabetical characters remain unchanged
            else {
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }
}
