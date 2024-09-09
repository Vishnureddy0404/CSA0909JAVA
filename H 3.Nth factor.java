import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the position of the factor you want to retrieve: ");
        int n = input.nextInt();
        int[] a = new int[100];
        int x = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                a[x] = i;
                x++;
            }
        }
        System.out.println("Number of factors = " + x);
        if (n > 0 && n <= x) {
            System.out.println(n + "th factor of " + num + " = " + a[n - 1]);
        } else {
            System.out.println("Invalid position. There are only " + x + " factors.");
        }
        input.close();
    }
}
