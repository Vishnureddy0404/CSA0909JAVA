import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of perfect numbers to find:");
        int n = input.nextInt(); 
        int sum = 0, temp = 0;
        for (int j = 2; j <= 1000; j++) {
            sum = 0;
            if (temp >= n) break; 
            for (int i = 1; i < j; i++) { 
                if (j % i == 0)
                    sum += i;
            }

            if (sum == j) { 
                System.out.print(j + " ");
                temp += 1; 
            }
        }
    }
}
