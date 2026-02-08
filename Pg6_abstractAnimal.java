// Create a class Animal (species - private, age & weight - protected, color).
// Create class Dog (breed, name, owner) which inherits from Animal.
// Include all types of constructors in the base class and overridden display methods.
// Create a class Cat (name, eyeColor, tailLength) which inherits from Animal.
// Include methods that give all details of a Cat.
// Demonstrate the concept of Abstract Base Class and Dynamic Method Dispatch.


abstract class Animal {
    private String species;
    protected int age;
    protected double weight;
    String color;

    Animal() {
        species = "Unknown";
        age = 0;
        weight = 0;
        color = "None";
    }

    Animal(String s, int a, double w, String c) {
        species = s;
        age = a;
        weight = w;
        color = c;
    }

    abstract void display();
}

class Dog extends Animal {
    String breed, name, owner;

    Dog(String s, int a, double w, String c, String b, String n, String o) {
        super(s, a, w, c);
        breed = b;
        name = n;
        owner = o;
    }

    @Override
    void display() {
        System.out.println("Dog Details:");
        System.out.println(name + " | " + breed + " | Owner: " + owner);
        System.out.println("Age: " + age + " Weight: " + weight + " Color: " + color);
    }
}

class Cat extends Animal {
    String name, eyeColor;
    int tailLength;

    Cat(String s, int a, double w, String c, String n, String e, int t) {
        super(s, a, w, c);
        name = n;
        eyeColor = e;
        tailLength = t;
    }

    @Override
    void display() {
        System.out.println("Cat Details:");
        System.out.println(name + " | EyeColor: " + eyeColor + " Tail: " + tailLength);
        System.out.println("Age: " + age + " Weight: " + weight + " Color: " + color);
    }
}

public class Pg6_abstractAnimal {
    public static void main(String args[]) {
        Animal a;
        a = new Dog("Mammal", 3, 12, "Brown", "Labrador", "Rocky", "Anu");
        a.display();   
        a = new Cat("Mammal", 2, 5, "White", "Kitty", "Blue", 20);
        a.display();
    }
}




// Dog Details:
// Rocky | Labrador | Owner: Anu
// Age: 3 Weight: 12.0 Color: Brown
// Cat Details:
// Kitty | EyeColor: Blue Tail: 20
// Age: 2 Weight: 5.0 Color: White