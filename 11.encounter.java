import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0; 
        int j = 0; 
        int n = 0; 
        int s1 = 0; 
        int s2 = 0; 
        while (true) {
            System.out.println("Enter a number (enter -1 to stop):");
            n = input.nextInt();
            if (n == -1) {
                break;
            }
            
            if (n > 0) {
                i++;
                s1 += n;
            } else if (n < 0) {
                j++;
                s2 += n;
            }
        }
        System.out.println("Count of positive numbers: " + i);
        System.out.println("Count of negative numbers: " + j);
        double pos = (i > 0) ? (double) s1 / i : 0; 
        double neg = (j > 0) ? (double) s2 / j : 0;
        System.out.println("The average of positive numbers: " + pos);
        System.out.println("The average of negative numbers: " + neg);
    }
}
