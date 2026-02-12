// Create an interface Comparable with methods to find volume and compare objects by their volume.
// Create classes Cuboid and Cylinder and compare their objects.

package pg12;
interface Comparable {
    double volume();
    void compareVolume(Comparable c);
}

class Cuboid implements Comparable {
    double l, w, h;

    Cuboid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public double volume() {
        return l * w * h;
    }

    public void compareVolume(Comparable c) {
        if (this.volume() > c.volume())
            System.out.println("Cuboid has greater volume");
        else if (this.volume() < c.volume())
            System.out.println("Cylinder has greater volume");
        else
            System.out.println("Both are equal");
    }
}

class Cylinder implements Comparable {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double volume() {
        return 3.14 * r * r * h;
    }

    public void compareVolume(Comparable c) {
        if (this.volume() > c.volume())
            System.out.println("Cylinder has greater volume");
        else if (this.volume() < c.volume())
            System.out.println("Cuboid has greater volume");
        else
            System.out.println("Both are equal");
    }
}

class Pg12_comparable {
    public static void main(String[] args) {

        Cuboid c1 = new Cuboid(4, 5, 6);
        Cylinder c2 = new Cylinder(3, 7);

        System.out.println("Cuboid Volume = " + c1.volume());
        System.out.println("Cylinder Volume = " + c2.volume());

        c1.compareVolume(c2);
    }
}




// Cuboid Volume = 120.0
// Cylinder Volume = 197.82
// Cylinder has greater volume

