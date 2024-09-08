import java.util.Scanner;
class FibonacciRunnable implements Runnable {
    private int count;
    public FibonacciRunnable(int count) {
        this.count = count;
    }
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        // Loop to generate the Fibonacci series
        for (int i = 2; i < count; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
public class FibonacciThread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = input.nextInt();
        FibonacciRunnable fibonacciRunnable = new FibonacciRunnable(n);
        Thread fibonacciThread = new Thread(fibonacciRunnable);
        fibonacciThread.start(); 
        input.close();
    }
}
