import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("The second smallest element is: " + secondSmallest);
        }
        scanner.close();
    }
}
