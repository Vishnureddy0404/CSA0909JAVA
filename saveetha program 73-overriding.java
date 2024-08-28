import java.util.Scanner;
public class R192211820 {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R192211820 calc = new R192211820();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:\n");
        double num2 = scanner.nextDouble();
        System.out.println("Addition:\n" + calc.add(num1, num2));
        System.out.println("Subtraction:\n" + calc.subtract(num1, num2));
        System.out.println("Multiplication:\n" + calc.multiply(num1, num2));
        System.out.println("Division:\n" + calc.divide(num1, num2));
        scanner.close();
    }
}
