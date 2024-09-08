import java.util.Scanner;
class PrimeChecker implements Runnable {
    private int number;
    public PrimeChecker(int number) {
        this.number = number;
    }
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class PrimeThread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = input.nextInt();
        PrimeChecker primeChecker = new PrimeChecker(num);
        Thread primeThread = new Thread(primeChecker);
        primeThread.start();
        input.close();
    }
}
