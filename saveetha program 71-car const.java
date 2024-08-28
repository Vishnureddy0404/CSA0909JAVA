import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void printCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        Car car = new Car(make, model, year);
        car.printCarDetails();

        scanner.close();
    }
}
