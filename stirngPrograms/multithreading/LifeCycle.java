package stirngPrograms.multithreading;

public class LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();

        Thread t1 = new Thread(() -> shared.print());
        Thread t2 = new Thread(() -> shared.print());

        t1.start();
        Thread.sleep(100); // Let t1 acquire lock first
        t2.start();
        Thread.sleep(100); // Let t2 try to acquire lock
        System.out.println("t1 state: " + t1.getState());
        System.out.println("t2 state: " + t2.getState()); // BLOCKED


        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(5000); // TIMED_WAITING
            } catch (InterruptedException e) {}
        });

        t3.start();
        Thread.sleep(100);
        System.out.println(t3.getState()); // TIMED_WAITING


        Thread t = new Thread(() -> System.out.println("   "));
        t.start();
        t.join(); // Wait for t to finish
        System.out.println(t.getState()); // TERMINATED

    }
}

class Shared {
    synchronized void print() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }
}
