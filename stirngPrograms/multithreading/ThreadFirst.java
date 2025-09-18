package stirngPrograms.multithreading;

public class ThreadFirst extends Thread{

    int counter=0;
    @Override
    public void run() {
        counter++;
        System.out.println("we are in the thread run method :+"+ Thread.currentThread().getName()+" counter "+ counter);
    }

    public static void main(String[] args) {
      ThreadFirst t= new ThreadFirst();
        Thread t2= new Thread(t,"a");
        Thread t3= new Thread(t,"b");
        Thread t4= new Thread(t,"c");
        Thread t5= new Thread(t,"d");
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

