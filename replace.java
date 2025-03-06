import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Input word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        // Input replacement word
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        // Replace word in sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Output the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
