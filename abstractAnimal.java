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

public class abstractAnimal {
    public static void main(String args[]) {
        Animal a;
        a = new Dog("Mammal", 3, 12, "Brown", "Labrador", "Rocky", "Anu");
        a.display();   
        a = new Cat("Mammal", 2, 5, "White", "Kitty", "Blue", 20);
        a.display();
    }
}