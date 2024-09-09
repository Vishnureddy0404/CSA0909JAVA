import java.util.Scanner;
public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the prime number you want to retrieve: ");
        int n = input.nextInt();
        int[] a = new int[100];
        int x = 0;
        for (int i = 2; i <= 100; i++) {
            int fact = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == 2) {
                a[x] = i;
                x++;
            }
        }
        if (n > 0 && n <= x) {
            System.out.println(n + "th prime number is " + a[n - 1]);
            System.out.print(n + " prime numbers after " + a[n - 1] + " are: ");
            for (int i = n; i < n + n && i < x; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Invalid position. There are only " + x + " prime numbers available.");
        }
        input.close();
    }
}
