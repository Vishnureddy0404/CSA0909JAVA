import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class R192211820 { 
    private String name;
    private String id;
    private List<Double> grades;
    public R192211820(String name, String id, List<Double> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public char getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name:\n");
        String name = scanner.nextLine();
        System.out.print("Enter student ID:\n");
        String id = scanner.nextLine();
        List<Double> grades = new ArrayList<>();
        System.out.print("Enter the number of grades:\n");
        int numberOfGrades = scanner.nextInt();
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }
        R192211820 student = new R192211820(name, id, grades);
        student.displayInfo();

        scanner.close();
    }
}
