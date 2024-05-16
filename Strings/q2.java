//Vowel Counter: Write a program that counts the number of vowels (a, e, i, o, u) present
//        in a given string. Utilize toLowerCase and loops to achieve this.
import java.util.*;
public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        str1 = str1.toLowerCase();
        char[] ch = str1.toCharArray();
        int x=0;
        for(int i=0;i<str1.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                x++;
            }
        }
        System.out.println(x);
    }
}
