// Write a Java program that creates two threads to perform the following:
//
// Thread A (Extending Thread): Print squares of numbers from 1 to 10 with 500ms delay.
// Thread B (Implementing Runnable): Print cubes of numbers from 1 to 10 with 700ms delay.
// Main thread prints "Calculations Complete!" only after both threads finish.

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
            try { Thread.sleep(700); } catch (Exception e) {}
        }
    }
}

public class Pg22_ThreadsSquaresCubes {
    public static void main(String[] args) throws Exception {

        ThreadA t1 = new ThreadA();
        Thread t2 = new Thread(new ThreadB());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Calculations Complete!");
    }
}

/*
Sample Output (order may vary):

Square of 1 = 1
Cube of 1 = 1
Square of 2 = 4
Cube of 2 = 8
...
Square of 10 = 100
Cube of 10 = 1000
Calculations Complete!
*/