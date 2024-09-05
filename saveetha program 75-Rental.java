import java.util.Scanner;
class Vehicle {
    String make;
    String model;
    boolean isRented;
    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = false;
    }
    void rentVehicle() {
        if (!isRented) {
            isRented = true;
            System.out.println(make + " " + model + " has been rented.\n");
        } else {
            System.out.println(make + " " + model + " is already rented.\n");
        }
    }
    void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(make + " " + model + " has been returned.\n");
        } else {
            System.out.println(make + " " + model + " was not rented.\n");
        }
    }
}
class Sedan extends Vehicle {
    int trunkCapacity; 
    Sedan(String make, String model, int trunkCapacity) {
        super(make, model);
        this.trunkCapacity = trunkCapacity;
    }
    void rentVehicle() {
        super.rentVehicle();
        if (isRented) {
            System.out.println("Trunk capacity: " + trunkCapacity + " liters.");
        }
    }
}
class SUV extends Vehicle {
    boolean allWheelDrive; 
    SUV(String make, String model, boolean allWheelDrive) {
        super(make, model);
        this.allWheelDrive = allWheelDrive;
    }
    void rentVehicle() {
        super.rentVehicle();
        if (isRented) {
            System.out.println("All-wheel drive: " + (allWheelDrive ? "Yes" : "No"));
        }
    }
}
public class R192211820 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter make of Sedan : ");
        String sedanMake = scanner.nextLine();
        System.out.print("Enter model of Sedan:\n");
        String sedanModel = scanner.nextLine();
        System.out.print("Enter trunk capacity of Sedan (in liters):\n");
        int sedanTrunkCapacity = scanner.nextInt();
        scanner.nextLine();
        Sedan sedan = new Sedan(sedanMake, sedanModel, sedanTrunkCapacity);
        System.out.print("Enter make of SUV:\n");
        String suvMake = scanner.nextLine();
        System.out.print("Enter model of SUV:\n");
        String suvModel = scanner.nextLine();
        System.out.print("Does the SUV have all-wheel drive? (true/false):\n");
        boolean suvAWD = scanner.nextBoolean();
        SUV suv = new SUV(suvMake, suvModel, suvAWD);
        System.out.println("\nRenting Vehicles:\n");
        sedan.rentVehicle();
        suv.rentVehicle();
        System.out.println("\nReturning Vehicles:\n");
        sedan.returnVehicle();
        suv.returnVehicle();
        scanner.close();
    }
}
