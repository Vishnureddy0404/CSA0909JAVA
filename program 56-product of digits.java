import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = Math.abs(number);
        int product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        System.out.println("The product of the digits of " + number + " is: " + product);
        scanner.close();
    }
}
