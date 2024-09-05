import java.util.Scanner;

// Parent class
class Shape {
    protected String color;
    protected double area;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Method to calculate area (will be overridden by child classes)
    public void calculateArea() {
        area = 0;
    }

    // Method to display color and area
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

// Child class for Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Method to calculate area of the circle
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Child class for Square
class Square extends Shape {
    private double side;

    // Constructor
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    // Method to calculate area of the square
    @Override
    public void calculateArea() {
        area = side * side;
    }

    // Method to calculate the perimeter of the square
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Child class for Triangle
class Triangle extends Shape {
    private double base, height;

    // Constructor
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of the triangle
    @Override
    public void calculateArea() {
        area = 0.5 * base * height;
    }

    // Method to calculate perimeter of the triangle (assuming equilateral triangle for simplicity)
    public double calculatePerimeter() {
        return 3 * base;
    }
}

public class R192211820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for radius:");
                    scanner.next();
                }
                double radius = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                
                System.out.println("Enter the color of the circle:");
                String circleColor = scanner.nextLine();
                Circle circle = new Circle(circleColor, radius);
                circle.calculateArea();
                circle.displayInfo();
                System.out.println("Perimeter: " + circle.calculatePerimeter());
                break;
                
            case 2:
                System.out.println("Enter the side length of the square:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for side length:");
                    scanner.next();
                }
                double side = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                
                System.out.println("Enter the color of the square:");
                String squareColor = scanner.nextLine();
                Square square = new Square(squareColor, side);
                square.calculateArea();
                square.displayInfo();
                System.out.println("Perimeter: " + square.calculatePerimeter());
                break;
                
            case 3:
                System.out.println("Enter the base length of the triangle:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for base length:");
                    scanner.next();
                }
                double base = scanner.nextDouble();
                
                System.out.println("Enter the height of the triangle:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for height:");
                    scanner.next();
                }
                double height = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                
                System.out.println("Enter the color of the triangle:");
                String triangleColor = scanner.nextLine();
                Triangle triangle = new Triangle(triangleColor, base, height);
                triangle.calculateArea();
                triangle.displayInfo();
                System.out.println("Perimeter: " + triangle.calculatePerimeter());
                break;
                
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        scanner.close();
    }
}
