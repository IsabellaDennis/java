// create a class Rectangle and Sphere 
// that implements interfaces Printable ,Computable and Drawable


package pg11;

interface Printable {
    void display();
}

// Interface to compute values
interface Computable {
    void compute();
}

// Interface to draw shape
interface Drawable {
    void draw();
}

// Rectangle class
class Rectangle implements Printable, Computable, Drawable {

    double length, width, area;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void compute() {
        area = length * width;
    }

    public void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Area   : " + area);
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Sphere class
class Sphere implements Printable, Computable, Drawable {

    double radius, volume;

    Sphere(double r) {
        radius = r;
    }

    public void compute() {
        volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    public void display() {
        System.out.println("Sphere Details:");
        System.out.println("Radius : " + radius);
        System.out.println("Volume : " + volume);
    }

    public void draw() {
        System.out.println("\nDrawing Sphere");
    }
}

// Main class
public class Pg11_Interface {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);
        r.compute();
        r.draw();
        r.display();

        Sphere s = new Sphere(3);
        s.compute();
        s.draw();
        s.display();
    }
}



// Drawing Rectangle
// Rectangle Details:
// Length : 5.0
// Width  : 4.0
// Area   : 20.0

// Drawing Sphere
// Sphere Details:
// Radius : 3.0
// Volume : 113.04

