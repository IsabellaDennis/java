// Demonstrate Reader-writer problem where the writer writes before the reader reads

class Reader implements Runnable {
    static final Object lock = Pg23_RW.lock; // FIXED
    static boolean writeDone = false;

    @Override
    public void run() {
        synchronized (lock) {
            try {
                while (!writeDone) {
                    lock.wait();
                }

                System.out.println("Reader is reading:");
                System.out.println("Read A");
                Thread.sleep(500);
                System.out.println("Read B");
                Thread.sleep(500);
                System.out.println("Read C");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Writer implements Runnable {
    static final Object lock = Pg23_RW.lock; // FIXED

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Writer is writing:");
                System.out.println("Write A");
                Thread.sleep(500);
                System.out.println("Write B");
                Thread.sleep(500);
                System.out.println("Write C");

                Reader.writeDone = true;
                lock.notifyAll();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Pg23_RW {
    static final Object lock = new Object();

    public static void main(String[] args) {

        Thread readerThread = new Thread(new Reader());
        Thread writerThread = new Thread(new Writer());

        readerThread.start(); // waits
        writerThread.start(); // executes first
    }
}

/*
Output:

Writer is writing:
Write A
Write B
Write C
Reader is reading:
Read A
Read B
Read C
*/