
import java.util.Scanner;

public class Q10 {
    static String Lower(String str) {
        return str.toLowerCase();
    }

    static String Upper(String str) {
        return str.toUpperCase();
    }
    static int searchChar(String str) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the character to search:");
        char c = obj.next().charAt(0);
        int firstIndex = str.indexOf(c);
        System.out.println("First occurrence of char " + c + " is found at index : " + firstIndex);
        return firstIndex;
    }
    static char index(String str) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Index:");
        int i = obj.nextInt();
        char result = str.charAt(i);
        System.out.println("The Character found: " + result);
        return result;
    }
    static String concatenate(String str) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a new String to Concatenate:");
        // Consume the newline character after taking input
        String ne = obj.nextLine();
        str = str.concat(ne);
        return str;
    }

    static void display(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = obj.nextLine();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lower Case");
            System.out.println("2. Upper Case");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for character at index");
            System.out.println("5. Concatenate");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    str = Lower(str);
                    break;
                case 2:
                    str = Upper(str);
                    break;
                case 3:
                    searchChar(str);
                    break;
                case 4:
                    index(str);
                    break;
                case 5:
                    str = concatenate(str);
                    break;
                case 6:
                    display(str);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }
    }
}
