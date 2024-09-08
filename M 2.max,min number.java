import java.util.Scanner;
public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int max = arr[len - m];
        int min = arr[n - 1];
        System.out.println(m + " maximum number = " + max);
        System.out.println(n + " minimum number = " + min);
        int sum = max + min;
        int Diff = max - min;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + Diff);
    }
}
