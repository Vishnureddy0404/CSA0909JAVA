import java.util.Scanner;
public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of notes for denomination 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the denomination 1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the number of notes for denomination 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the denomination 2: ");
        int d2 = sc.nextInt();
        System.out.print("Enter the number of notes for denomination 3: ");
        int n3 = sc.nextInt();
        System.out.print("Enter the denomination 3: ");
        int d3 = sc.nextInt();
        System.out.print("Enter the number of notes for denomination 4: ");
        int n4 = sc.nextInt();
        System.out.print("Enter the denomination 4: ");
        int d4 = sc.nextInt();
        int Total = (n1 * d1) + (n2 * d2) + (n3 * d3) + (n4 * d4);
        System.out.println("Total Available Balance in ATM: " + Total);
    }
}
