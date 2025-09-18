package stirngPrograms.multithreading;

public class RunVsStart extends Thread{

    @Override
    public void run() {
        System.out.println("executing the main logic : "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1= new RunVsStart();
        System.out.println("calling run");
        t1.run();  //
        System.out.println("calling start");
        t1.start();  // this one create new thread


    }
}

