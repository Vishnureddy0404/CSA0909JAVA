import java.util.Scanner;

public class RectanglePattern {

    public static void printRectanglePattern(int rows, int cols, char symbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        System.out.print("Enter the symbol to use: ");
        char symbol = input.next().charAt(0);

        printRectanglePattern(rows, cols, symbol);

        input.close();
    }
}
