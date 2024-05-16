//Pig Latin Translator: Write a program that translates a sentence into Pig Latin. The first
//consonant sound is moved to the end of the word followed by "ay". Use methods like
//substring, concat, and loops for this translation.
import java.util.*;
public class q5 {
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    private static String translateWordToPigLatin(String word) {
        if (word.isEmpty()) return "";

        // If the word starts with a consonant
        if (!isVowel(word.charAt(0))) {
            int index = 0;
            // Finding the index of the first vowel
            for (char c : word.toCharArray()) {
                if (isVowel(c)) break;
                index++;
            }
            return word.substring(index) + word.substring(0, index) + "ay";
        } else {
            // If the word starts with a vowel
            return word + "ay";
        }
    }

    public static String translateToPigLatin(String sentence) {
        StringBuilder pigLatinSentence = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            pigLatinSentence.append(translateWordToPigLatin(word)).append(" ");
        }

        return pigLatinSentence.toString().trim();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence to translate into Pig Latin: ");
        String sentence = sc.nextLine();
        String pigLatinSentence = translateToPigLatin(sentence);
        System.out.println("Pig Latin translation: " + pigLatinSentence);

        sc.close();
    }
}
