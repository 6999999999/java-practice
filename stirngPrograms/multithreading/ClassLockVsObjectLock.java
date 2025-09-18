package stirngPrograms.multithreading;

public class ClassLockVsObjectLock  {

    public static synchronized void objectLock() {
        System.out.println(Thread.currentThread().getName()+ " Acquired the lock");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("testig rollback feature");
        ClassLockVsObjectLock lock1= new ClassLockVsObjectLock();
        ClassLockVsObjectLock lock2= new ClassLockVsObjectLock();

        new Thread(ClassLockVsObjectLock::objectLock).start();
        new Thread(ClassLockVsObjectLock::objectLock).start();

    }
}
