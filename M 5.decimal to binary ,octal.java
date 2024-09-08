import java.util.Scanner;
public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int dec = scanner.nextInt();
        String bin = Integer.toBinaryString(dec);
        String oct = Integer.toOctalString(dec);
        System.out.println("Binary number = " + bin);
        System.out.println("Octal number = " + oct);
        scanner.close();
    }
}
