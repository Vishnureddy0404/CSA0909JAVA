import java.util.Scanner;

public class SkipNumbers {

    public static void printSkippedNumbers(int M, int N, int K) {
        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i);
            if (i + K + 1 <= N) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int M = input.nextInt();

        System.out.print("Enter the value of N: ");
        int N = input.nextInt();

        System.out.print("Enter the value of K: ");
        int K = input.nextInt();

        printSkippedNumbers(M, N, K);

        input.close();
    }
}
