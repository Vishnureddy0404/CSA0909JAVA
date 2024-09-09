import java.util.Scanner;
public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements for array a: ");
        int nA = scanner.nextInt();
        int[] a = new int[nA];
        System.out.println("Enter the elements for array a:");
        for (int i = 0; i < nA; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements for array b: ");
        int nB = scanner.nextInt();
        int[] b = new int[nB];
        System.out.println("Enter the elements for array b:");
        for (int i = 0; i < nB; i++) {
            b[i] = scanner.nextInt();
        }
        int len = b.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (b[i] == b[j]) {
                    for (int k = j; k < len - 1; k++) {
                        b[k] = b[k + 1];
                    }
                    len--;
                    j--;
                }
            }
        }
        System.out.println("Common elements between arrays a and b:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < len; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        scanner.close();
    }
}
