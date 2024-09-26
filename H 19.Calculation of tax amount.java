import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        double taxableIncome = Math.max(0, income - 250000);
        System.out.printf("Taxable Income: %.2f\n", taxableIncome);
        System.out.printf("Tax= %.2f\n", tax);
    }
    public static double calculateTax(double income) {
        double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.10;
        } else if (income <= 1000000) {
            tax = (250000 * 0.10) + (income - 500000) * 0.20;
        } else {
            tax = (250000 * 0.10) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }
        return tax;
    }
}
