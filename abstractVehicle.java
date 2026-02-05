abstract class Vehicle {
    String model, company;

    Vehicle(String m, String c) {
        model = m;
        company = c;
    }

    abstract void show();
}

class Car extends Vehicle {
    int doors;
    String fuelType;

    Car(String m, String c, int d, String f) {
        super(m, c);
        doors = d;
        fuelType = f;
    }

    void show() {
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Doors: " + doors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Electric extends Car {
    int batteryCapacity;

    Electric(String m, String c, int d, String f, int b) {
        super(m, c, d, f);
        batteryCapacity = b;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class abstractVehicle {

    public static void main(String args[]) {

        Vehicle v;   // Dynamic Method Dispatch

        v = new Electric("Nexon", "Tata", 4, "Electric", 40);

        v.show();
    }
}
