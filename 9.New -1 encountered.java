import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 0;
        int n = 0;
        int s1 = 0, s2 = 0;
        double pos = 0, neg = 0;
        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            n = input.nextInt();
            if (n == -1) break;

            if (n > 0) {
                i++;
                s1 += n;
            } else if (n < 0) {
                j++;
                s2 += n;
            }
        }

        if (i > 0) {
            pos = (double) s1 / i;
        }
        if (j > 0) {
            neg = (double) s2 / j;
        }

        System.out.println("Count of positive numbers: " + i);
        System.out.println("Count of negative numbers: " + j);
        System.out.println("The average of positive numbers: " + pos);
        System.out.println("The average of negative numbers: " + neg);

        input.close();
    }
}
