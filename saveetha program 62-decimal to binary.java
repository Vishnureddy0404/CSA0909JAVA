import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number:\n");
        int decimal = scanner.nextInt();
        String binary = "";
        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
        }
        System.out.println("The binary equivalent is: " + binary);
        scanner.close();
    }
}
