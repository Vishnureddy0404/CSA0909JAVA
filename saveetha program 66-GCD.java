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
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        scanner.close();
    }
}
