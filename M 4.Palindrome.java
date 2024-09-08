import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String s2 = "";
        int len = s1.length();
        for (int i = len - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
