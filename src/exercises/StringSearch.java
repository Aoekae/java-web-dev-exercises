package exercises;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceInWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        System.out.println("What phrase would you like to search for?");
        String phrase = input.nextLine();
        if (aliceInWonderland.contains(phrase)) {
            System.out.println(phrase + " is in the quote!");
            Integer index = aliceInWonderland.indexOf(phrase);
            Integer length = phrase.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = aliceInWonderland.replace(phrase, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println(phrase + " isn't in the quote!");
        }
    }
}
