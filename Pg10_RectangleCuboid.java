// create a class Rectangle(length,width)
// Define interfaces,measurable with a method declaration to find volume of objects and 
// printable with a method declaration to display particulars of the object.
// create a class Cuboid(height) that inherits from Rectangle and implement interfaces



interface Measurable {
    double volume();
}

// Interface to display details
interface Printable {
    void display();
}

// Rectangle class
class Rectangle {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
}

// Cuboid class inherits Rectangle and implements interfaces
class Cuboid extends Rectangle implements Measurable, Printable {

    double height;

    Cuboid(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    // Implement volume method
    public double volume() {
        return length * width * height;
    }

    // Implement display method
    public void display() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + volume());
    }
}

// Main class
public class Pg10_RectangleCuboid {
    public static void main(String[] args) {

        Cuboid c = new Cuboid(5, 4, 3);
        c.display();
    }
}




// Length : 5.0
// Width  : 4.0
// Height : 3.0
// Volume : 60.0

