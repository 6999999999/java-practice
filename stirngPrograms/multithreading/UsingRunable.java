package stirngPrograms.multithreading;

import javax.swing.plaf.IconUIResource;

public class UsingRunable implements Runnable{
    int counter=0;
    @Override
    public void run() {
        counter++;
        System.out.println("we are in the Runnable run method :="+ Thread.currentThread().getName()+" counter: "+ counter);
    }

    public static void main(String[] args) {
        UsingRunable sharedTask= new UsingRunable();
        Thread t1= new Thread(sharedTask,"a");
        Thread t2= new Thread(sharedTask,"b");
        Thread t3= new Thread(sharedTask,"c");
        Thread t4= new Thread(sharedTask,"d");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
