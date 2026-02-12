// Lambda Expressions

// Design a functional interface, Dim, having the method to find area.
// Create lambda functions to find the area of:
// (a) Square
// (b) Cube
// (c) Circle
// (d) Sphere


interface Dim {
    double area(double x);
}

public class Pg14_Lambda {
    public static void main(String[] args) {

        // (a) Square
        Dim square = (side) -> side * side;

        // (b) Cube (Surface Area = 6a²)
        Dim cube = (side) -> 6 * side * side;

        // (c) Circle
        Dim circle = (radius) -> 3.14 * radius * radius;

        // (d) Sphere (Surface Area = 4πr²)
        Dim sphere = (radius) -> 4 * 3.14 * radius * radius;

        double value = 4;

        System.out.println("Square Area = " + square.area(value));
        System.out.println("Cube Surface Area = " + cube.area(value));
        System.out.println("Circle Area = " + circle.area(value));
        System.out.println("Sphere Surface Area = " + sphere.area(value));
    }
}



// Square Area = 16.0
// Cube Surface Area = 96.0
// Circle Area = 50.24
// Sphere Surface Area = 200.96
