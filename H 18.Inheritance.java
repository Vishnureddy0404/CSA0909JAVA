import java.util.Scanner;
class Student {
    String name;
    int[] marks = new int[6];

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Python", "C Programming", "Mathematics", "Physics", "Chemistry", "Professional Ethics"};

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
    }
}

class Result extends Student {
    int total;
    double aggregate;
    String grade;

    public void calculateTotalAndAggregate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        aggregate = (double) total / 6;
    }

    public void assignGrade() {
        if (aggregate > 75) {
            grade = "DISTINCTION";
        } else if (aggregate > 60) {
            grade = "FIRST DIVISION";
        } else if (aggregate > 50) {
            grade = "SECOND DIVISION";
        } else if (aggregate > 40) {
            grade = "THIRD DIVISION";
        } else {
            grade = "FAIL";
        }
    }

    public void displayResult() {
        System.out.println("Total = " + total);
        System.out.printf("Aggregate = %.2f\n", aggregate);
        System.out.println("Class: " + grade);
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Result student = new Result();
        student.inputMarks();
        student.calculateTotalAndAggregate();
        student.assignGrade();
        student.displayResult();
    }
}
