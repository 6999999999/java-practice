package stirngPrograms.multithreading;

public class DemonThreadVsUserThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("we are in the demon thread");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
//        t1.setDaemon(true);
//        t1.start();
        Thread.sleep(1000);
    }

}
