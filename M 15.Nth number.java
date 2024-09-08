import java.util.Arrays;
import java.util.Scanner;
public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {14, 67, 48, 23, 5, 62};
        int len = a.length;
        Arrays.sort(a);
        System.out.print("Enter the value of N (to find the Nth largest number): ");
        int N = input.nextInt();
        if (N <= len && N > 0) {
            System.out.println(N + " Largest number: " + a[len - N]);
        } else {
            System.out.println("Invalid input for N. It should be between 1 and " + len);
        }

        input.close();
    }
}
