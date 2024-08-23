import java.util.Scanner;

public class CompositeNumbers {

    public static boolean isComposite(int num) {
        if (num < 4) {
            return false;  
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;  
            }
        }

        return false;  
    }

    public static void printCompositeNumbers(int A, int B) {
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = input.nextInt();

        System.out.print("Enter the value of B: ");
        int B = input.nextInt();

        System.out.print("Composite numbers between " + A + " and " + B + ": ");
        printCompositeNumbers(A, B);

        input.close();
    }
}
