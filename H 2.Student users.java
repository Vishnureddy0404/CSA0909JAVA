import java.util.Scanner;
public class UserCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Users: ");
        int totalUser = input.nextInt();
        System.out.print("Staff Users: ");
        int staffUser = input.nextInt();
        int nonTech = staffUser / 3;
        int studentUser = totalUser - (staffUser + nonTech);
        System.out.println("Student Users: " + studentUser);
        input.close();
    }
}
