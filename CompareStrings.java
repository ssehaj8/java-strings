import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        // Compare the two strings lexicographically
        int result = compareStrings(string1, string2);

        // Output the result
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static int compareStrings(String s1, String s2) {
        // Compare character by character
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;  // string1 comes first
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return 1;   // string2 comes first
            }
        }

        // If all characters are the same up to the length of the shortest string, compare lengths
        if (s1.length() < s2.length()) {
            return -1;  // string1 comes first if it is shorter
        } else if (s1.length() > s2.length()) {
            return 1;   // string2 comes first if it is shorter
        }

        return 0;  // strings are equal
    }
}
