import java.util.Scanner;

public class validation {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int n = scanner.nextInt();
        
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        
        int lcmResult = lcm(n, b);
        int gcdResult = gcd(n, b);
        
        System.out.println("LCM = " + lcmResult);
        System.out.println("GCD = " + gcdResult);
    }
}
