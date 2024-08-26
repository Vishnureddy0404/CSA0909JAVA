import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum value for the Fibonacci series:\n");
        int maxNumber = scanner.nextInt();
        if (maxNumber < 0) {
            System.out.println("The maximum value must be a non-negative integer.");
        } else {
            int a = 0; 
            int b = 1;
            System.out.println("Fibonacci series up to " + maxNumber + ":");
            if (maxNumber >= a) {
                System.out.print(a + " ");
            }
            if (maxNumber >= b) {
                System.out.print(b + " ");
            }
            int nextNumber;
            while (true) {
                nextNumber = a + b;
                if (nextNumber > maxNumber) {
                    break;
                }
                System.out.print(nextNumber + " ");
                a = b;
                b = nextNumber;
            }
        }
        scanner.close();
    }
}
