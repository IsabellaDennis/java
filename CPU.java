// Create a class CPU with attribute price.
// Create an inner class Processor (no. of cores, manufacturer) and a static nested class RAM (memory, manufacturer) inside CPU.
// Create an object of CPU and print details of its processor and RAM.


class CPU {

    int price;

    // Constructor
    CPU(int price) {
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

        CPU cpu = new CPU(45000);
        System.out.println("CPU Price : " + cpu.price);

        CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.display();

        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.display();
    }
}



// CPU Price : 45000
// Processor Cores : 8
// Processor Manufacturer : Intel
// RAM Memory : 16 GB
// RAM Manufacturer : Corsair
