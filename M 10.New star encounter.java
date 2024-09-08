import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters (Enter '*' to exit):");
        char c;
        int lower = 0, upper = 0, digit = 0;
        while (true) {
            c = input.next().charAt(0); 
            if (c == '*') {
                break;
            }
            if (c >= 'A' && c <= 'Z') {
                upper++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            } else if (c >= '0' && c <= '9') {
                digit++;
            }
        }
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Digits: " + digit);
        input.close();
    }
}
