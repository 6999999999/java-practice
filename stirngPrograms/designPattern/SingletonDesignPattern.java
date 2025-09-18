package stirngPrograms.designPattern;

public class SingletonDesignPattern {

    public static void main(String[] args) {
      Singleton singleton=  Singleton.getInstance();
        System.out.println(singleton);
    }
}

class Singleton{
    private static final Singleton singleton= new Singleton();

    private Singleton(){

    }

    public static  Singleton getInstance(){
        return singleton;
    }
}
