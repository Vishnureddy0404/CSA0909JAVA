import java.util.Scanner;
public class R192211820 {
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    public static double sum(double... numbers) {
        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers:\n");
        int intCount = scanner.nextInt();
        int[] intArray = new int[intCount];
        System.out.println("Enter " + intCount + " integers:");
        for (int i = 0; i < intCount; i++) {
            intArray[i] = scanner.nextInt();
        }
        int intSum = sum(intArray);
        System.out.println("Sum of integers: " + intSum);
        System.out.print("Enter the number of doubles:\n");
        int doubleCount = scanner.nextInt();
        double[] doubleArray = new double[doubleCount];
        System.out.println("Enter " + doubleCount + " doubles:");
        for (int i = 0; i < doubleCount; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        double doubleSum = sum(doubleArray);
        System.out.println("Sum of doubles: " + doubleSum);
        scanner.close();
    }
}
