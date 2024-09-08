import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (N): ");
        int N = input.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        try {
            for (int i = 0; i <= N; i++) { 
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index " + N + " is out of bounds!");
        }
        System.out.println("Sum of numbers: " + sum);
        input.close();
    }
}
