import java.util.Scanner;
class Animal {
    protected String name;
    protected String habitat;
    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Habitat: " + habitat);
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void reproduce() {
        System.out.println(name + " is reproducing.");
    }
}
class Mammal extends Animal {
    public Mammal(String name, String habitat) {
        super(name, habitat);
    }
    public void eat() {
        System.out.println(name + " (Mammal) is eating plants or meat.");
    }
    public void reproduce() {
        System.out.println(name + " (Mammal) gives birth to live young.");
    }
}
class Reptile extends Animal {
    public Reptile(String name, String habitat) {
        super(name, habitat);
    }
    public void eat() {
        System.out.println(name + " (Reptile) is eating insects or small animals.");
    }
    public void reproduce() {
        System.out.println(name + " (Reptile) lays eggs.");
    }
}
class Bird extends Animal {

    public Bird(String name, String habitat) {
        super(name, habitat);
    }
    public void eat() {
        System.out.println(name + " (Bird) is pecking at seeds or insects.");
    }
    public void reproduce() {
        System.out.println(name + " (Bird) lays eggs.");
    }
}

public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an animal class:");
        System.out.println("1. Mammal");
        System.out.println("2. Reptile");
        System.out.println("3. Bird");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        System.out.println("Enter the name of the animal:");
        String name = scanner.nextLine();
        
        System.out.println("Enter the habitat of the animal:");
        String habitat = scanner.nextLine();
        
        switch (choice) {
            case 1:
                Mammal mammal = new Mammal(name, habitat);
                mammal.displayInfo();
                mammal.eat();
                mammal.reproduce();
                break;
            case 2:
                Reptile reptile = new Reptile(name, habitat);
                reptile.displayInfo();
                reptile.eat();
                reptile.reproduce();
                break;
            case 3:
                Bird bird = new Bird(name, habitat);
                bird.displayInfo();
                bird.eat();
                bird.reproduce();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        scanner.close();
    }
}
