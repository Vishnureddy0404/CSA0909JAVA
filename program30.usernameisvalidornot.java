import java.util.Scanner;
public class UsernameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String username1 = sc.nextLine();
        System.out.print("Reenter the user name: ");
        String username2 = sc.nextLine();
        if (username1.equals(username2)) {
            System.out.println("User name is Valid");
        } else {
            System.out.println("User name is Invalid");
        }

        sc.close();
    }
}
