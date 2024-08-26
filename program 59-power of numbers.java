import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number:\n");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent:\n");
        int exponent = scanner.nextInt();
        if (exponent < 0) {
            System.out.println("Exponent must be a non-negative integer.");
        } else {
            long result = 1;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
        scanner.close();
    }
}
