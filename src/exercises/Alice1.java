package exercises;

import java.util.Scanner;

public class Alice1 {
    public static void main(String[] args) {

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank" +
                ", and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String word = input.next();

        input.close();

        if(sentence.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("True");
            String newSentence = sentence.replaceAll("(?i)" + word,"");
            System.out.println(newSentence);

            System.out.println("Index: " + sentence.toLowerCase().indexOf(word.toLowerCase()));
            System.out.println("Length: " + word.length());
        }else {
            System.out.println("False");
        }
    }
}
