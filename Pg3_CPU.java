// Create a class CPU with attribute price.
// Create an inner class Processor (no. of cores, manufacturer) and a static nested class RAM (memory, manufacturer) inside CPU.
// Create an object of CPU and print details of its processor and RAM.


class Pg3_CPU {

    int price;

    // Constructor
    Pg3_CPU(int price) {
        this.price = price;
    }

    // Inner class
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores : " + cores);
            System.out.println("Processor Manufacturer : " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory : " + memory + " GB");
            System.out.println("RAM Manufacturer : " + manufacturer);
        }
    }

    // Main method
    public static void main(String[] args) {

        Pg3_CPU cpu = new Pg3_CPU(45000);
        System.out.println("CPU Price : " + cpu.price);

        Pg3_CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.display();

        Pg3_CPU.RAM ram = new Pg3_CPU.RAM(16, "Corsair");
        ram.display();
    }
}



// CPU Price : 45000
// Processor Cores : 8
// Processor Manufacturer : Intel
// RAM Memory : 16 GB
// RAM Manufacturer : Corsair
