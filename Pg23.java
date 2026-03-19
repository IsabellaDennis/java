class Reader implements Runnable {
    static final Object lock = Pg23.lock;
    static boolean writeDone = false;

    @Override
    public void run() {
        synchronized (lock) {
            try {
                while (!writeDone) {
                    lock.wait(); // wait until writer finishes
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
    static final Object lock = Pg23.lock;

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

                Reader.writeDone = true; // signal completion
                lock.notifyAll(); // wake up reader

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Pg23 {
    static final Object lock = new Object();

    public static void main(String[] args) {

        Thread readerThread = new Thread(new Reader());
        Thread writerThread = new Thread(new Writer());

        readerThread.start(); // reader starts first (but waits)
        writerThread.start(); // writer executes first
    }
}