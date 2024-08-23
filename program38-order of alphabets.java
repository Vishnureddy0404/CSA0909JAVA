import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class NameSorter {

    public static void sortNames(String[] names, char order) {
        if (order == 'A' || order == 'a') {
            Arrays.sort(names);
        } else if (order == 'D' || order == 'd') {
            Arrays.sort(names, Comparator.reverseOrder());
        } else {
            System.out.println("Invalid order choice. Please choose 'A' for ascending or 'D' for descending.");
            return;
        }

        System.out.println("Sorted names: " + String.join(" ", names));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numberOfNames = input.nextInt();
        input.nextLine();  // Consume the newline

        String[] names = new String[numberOfNames];

        System.out.println("Enter the names:");
        for (int i = 0; i < numberOfNames; i++) {
            names[i] = input.nextLine();
        }

        System.out.print("Order(A/D): ");
        char order = input.next().charAt(0);

        sortNames(names, order);

        input.close();
    }
}
