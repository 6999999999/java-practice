package stirngPrograms.multithreading;

public class ImportantMethodOfThread {
//    start(), run(), sleep(), join(), yield(), interrupt()
public static void main(String[] args) throws InterruptedException {

    Thread t= new Thread(()->{
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    t.start();
    t.join();
    System.out.println("Hello");

}
}

