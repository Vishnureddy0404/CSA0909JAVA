import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary;
        double bonus = 0;
        System.out.print("Enter the grade of the employee: ");
        char grade = input.next().charAt(0);
        System.out.print("Enter the salary of the employee: ");
        salary = input.nextInt();
        if (grade == 'A') {
            bonus = salary * 0.05;
            if (salary < 10000) {
                bonus += salary * 0.02;
            }
        } else if (grade == 'B') {
            bonus = salary * 0.1;
            if (salary < 10000) {
                bonus += salary * 0.02;
            }
        } else {
            System.out.println("Enter valid grade");
            input.close();
            return;
        }
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + (salary + bonus));

        input.close();
    }
}
