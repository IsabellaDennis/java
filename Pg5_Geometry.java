// Demonstrate method overloading: 
// create Geometry class with methods to find area of a 
// square(int), rectangle (int,int) and circle (double)

class Pg5_Geometry {

    // Area of square
    void area(int side) {
        System.out.println("Area of Square : " + (side * side));
    }

    // Area of rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle : " + (length * breadth));
    }

    // Area of circle
    void area(double radius) {
        System.out.println("Area of Circle : " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Pg5_Geometry g = new Pg5_Geometry();

        g.area(5);        // square
        g.area(10, 4);    // rectangle
        g.area(3.5);      // circle
    }
}




// Area of Square : 25
// Area of Rectangle : 40
// Area of Circle : 38.465

