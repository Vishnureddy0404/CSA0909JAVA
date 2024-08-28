import java.util.Scanner;
public class R192211820 { 
    private String accountNumber;
    private double balance;
    public R192211820(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number:\n");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        R192211820 myAccount = new R192211820(accountNumber, initialBalance);
        myAccount.displayBalance();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);
        myAccount.displayBalance();
        System.out.print("Enter amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawalAmount);
        myAccount.displayBalance();
        scanner.close();
    }
}
