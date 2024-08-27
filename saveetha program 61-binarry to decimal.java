import java.util.Scanner;
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number:\n");
        String binaryString = scanner.nextLine();
        int decimal = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            char currentChar = binaryString.charAt(i);
            if (currentChar == '1') {
                decimal += Math.pow(2, length - i - 1);
            }
        }
        System.out.println("The decimal equivalent is: " + decimal);
        scanner.close();
    }
}
