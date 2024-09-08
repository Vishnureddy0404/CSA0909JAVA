import java.util.Scanner;
public class CompositePrimeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int com = 0, pri = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    c++;
            }
            if (c > 2)  
                com++;
            else if (c == 2)  
                pri++;
        }
        System.out.print("Composite Number: " + com);
        System.out.println("\nPrime Number: " + pri);
        scanner.close();
    }
}

