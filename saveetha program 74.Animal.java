import java.util.Scanner;
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " is eating dog food.");
    }

    void sleep() {
        System.out.println(name + " is sleeping in the kennel.");
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " is eating cat food.");
    }

    void sleep() {
        System.out.println(name + " is sleeping on the couch.");
    }
}
public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of your dog:\n");
        String dogName = scanner.nextLine();
        Animal dog = new Dog(dogName);

        System.out.print("Enter the name of your cat:\n");
        String catName = scanner.nextLine();
        Animal cat = new Cat(catName);
        System.out.println("\nDemonstrating Polymorphism:");
        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();

        scanner.close();
    }
}
