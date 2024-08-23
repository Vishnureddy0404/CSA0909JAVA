import java.util.Scanner;

public class EvenIndexFibonacciSum {

    public static int evenIndexFibonacciSum(int n) {
        int sum = 0;
        int a = 0, b = 1;
        
        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = evenIndexFibonacciSum(n);
        System.out.println("Even sum of Fibonacci series till " + (2 * n) + "th term is: " + result);

        scanner.close();
    }
}
