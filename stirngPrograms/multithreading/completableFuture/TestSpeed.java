package stirngPrograms.multithreading.completableFuture;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

public class TestSpeed {
    public static void main(String[] args) {
        Instant start= Instant.now();

//        doTask("Task1");
//        doTask("Task2");
//        doTask("Task3");


        CompletableFuture<Void> task1= CompletableFuture.runAsync(()->doTask("task1"));
        CompletableFuture<Void> task2= CompletableFuture.runAsync(()->doTask("task2"));
        CompletableFuture<Void> task3= CompletableFuture.runAsync(()->doTask("task3"));

        CompletableFuture.allOf(task1,task2,task3).join();

        Instant end= Instant.now();

        System.out.println("Total time take " + Duration.between(start,end).toMillis()+" ms");
    }

    private static void doTask(String task) {
        try {
            Thread.sleep(1000);
            System.out.println(task+ " completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
