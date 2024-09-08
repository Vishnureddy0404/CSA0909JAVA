import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for subject 1:");
        int a1 = input.nextInt();
        System.out.println("Enter marks for subject 2:");
        int a2 = input.nextInt();
        System.out.println("Enter marks for subject 3:");
        int a3 = input.nextInt();
        System.out.println("Enter marks for subject 4:");
        int a4 = input.nextInt();
        int total = a1 + a2 + a3 + a4;
        float agg = total / 4f;
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + agg);
        if (agg > 75)
            System.out.println("DISTINCTION");
        else if (agg >= 60 && agg < 75)
            System.out.println("First Division");
        else if (agg >= 50 && agg < 60)
            System.out.println("Second Division");
        else if (agg >= 40 && agg < 50)
            System.out.println("Third Division");
        else
            System.out.println("Fail");
    }
}
