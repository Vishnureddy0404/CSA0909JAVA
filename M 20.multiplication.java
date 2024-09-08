class MultiplicationTable extends Thread {
    private int number;
    public MultiplicationTable(int number) {
        this.number = number;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        System.out.println("Thread for " + number + " completed.");
    }
}
public class MultiplicationTableThread {
    public static void main(String[] args) {
        MultiplicationTable tableForFive = new MultiplicationTable(5);
        MultiplicationTable tableForTen = new MultiplicationTable(10);
        tableForFive.start();
        tableForTen.start();
        try {
            tableForFive.join();
            tableForTen.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both threads have completed.");
    }
}
