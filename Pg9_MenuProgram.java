// Create an interface with functions area() and perimeter().
// Create two classes Circle and Rectangle which implement the above interface.
// Create a menu-driven program to find the area and perimeter of various objects.


import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

public class Pg9_MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}

// 1. Circle
// 2. Rectangle
// 3. Exit
// Enter your choice: 1
// Enter radius: 7
// Area of Circle = 153.86
// Perimeter of Circle = 43.96

// 1. Circle
// 2. Rectangle
// 3. Exit
// Enter your choice: 2
// Enter length: 5
// Enter breadth: 4
// Area of Rectangle = 20.0
// Perimeter of Rectangle = 18.0

// 1. Circle
// 2. Rectangle
// 3. Exit
// Enter your choice: 3
// Exiting...


