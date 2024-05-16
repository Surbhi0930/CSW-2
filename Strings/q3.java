//Word Reversal: Write a program that reverses the order of words in a sentence. Use
//split, StringBuilder, and a loop to reverse the order of words while maintaining spaces
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        String[] words = str1.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            if(i== words.length-1){
                str2.append(words[i]);
            }
            else{
                str2.append(" ").append(words[i]);
            }

        }
        System.out.println(str2);
    }
}
