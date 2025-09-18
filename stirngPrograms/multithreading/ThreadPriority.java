package stirngPrograms.multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1= new Thread(()->{System.out.println("Running the thread 1");});
        Thread t2= new Thread(()->{System.out.println("Running the thread 2");});
        Thread t3= new Thread(()->{System.out.println("Running the thread 3");});
        Thread t4= new Thread(()->{System.out.println("Running the thread 4");});

        t1.setPriority(5);
        t2.setPriority(1);
        t3.setPriority(2);
        t4.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
