import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:\n");
        int a = scanner.nextInt();
        System.out.print("Enter the second number:\n");
        int b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Numbers must be positive.");
            return;
        }
        int max = (a > b) ? a : b;
        int lcm = max;
        while (lcm % a != 0 || lcm % b != 0) {
            lcm += max;
        }
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        scanner.close();
    }
}
