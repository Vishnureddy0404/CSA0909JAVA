import java.util.Scanner;
public class R192211820 {
    private double length;
    private double width;
    public R192211820 (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public static void main(String[] args) {
        R192211820 rect = new R192211820 (5.0, 3.0);
        double area = rect.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
