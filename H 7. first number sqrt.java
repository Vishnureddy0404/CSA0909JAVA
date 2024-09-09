import java.util.Scanner;
public class SquarePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = input.nextInt();
        for (int i = lower; i <= upper; i++) {
            System.out.println("(" + i + "," + (i * i) + ") ");
        }
        input.close();
    }
}
