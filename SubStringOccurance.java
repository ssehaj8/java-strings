import java.util.Scanner;

public class SubStringOccurance
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string and the substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring occurs " + count + " times.");
    }

    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop through the main string and check for occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move the index forward after a match
        }

        return count;
    }
}



/////input: main string: hello world hello world hello      sub-string:hello
/////output: 3
