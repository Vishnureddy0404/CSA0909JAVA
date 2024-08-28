import java.util.Scanner;
public class R192211820 {
    private String name;
    private int age;
    public R192211820 (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:\n");
        String name = scanner.nextLine();
        System.out.print("Enter age:\n");
        int age = scanner.nextInt();
        R192211820 person = new R192211820 (name, age);
        person.printDetails();
        scanner.close();
    }
}

