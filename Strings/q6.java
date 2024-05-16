//Duplicate Character Remover: Write a program that removes all duplicate characters
//from a given string. Use a loop with conditional statements and potentially toCharArray
//to achieve this.

import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        StringBuilder str2 = new StringBuilder();

        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i <str1.length() ; i++) {
            char ch = str1.charAt(i);
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
                str2.append(ch);
            }
        }
        System.out.println(str2.toString());
    }
}
