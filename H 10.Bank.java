import java.util.Scanner;
class Customer {
    private int accountNo;
    private String accName;
    private int balance;
    public Customer(int accountNo, String accName, int initialBalance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
        notify();
    }
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("Withdraw interrupted.");
            }
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ". New balance: " + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        final int INITIAL_BALANCE = 10000;
        Customer customer = new Customer(1, "John Doe", INITIAL_BALANCE);
        Thread withdrawThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            int withdrawAmount = scanner.nextInt();
            customer.withdraw(withdrawAmount);
        });
        Thread depositThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to deposit: ");
            int depositAmount = scanner.nextInt();
            customer.deposit(depositAmount);
        });
        withdrawThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        depositThread.start();
    }
}
