package org.example;

import java.util.concurrent.*;

import static org.example.MyCallableG.logger;


public class Main {
    public static void main(String[] args) {

        MyRunnable task1 = new MyRunnable("Task1");
        MyRunnable task2 = new MyRunnable("Task2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();


        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new MyCallable());

        try {
            Integer result = future.get();
            System.out.println("Result callable " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();


//        MyCallableG
        ExecutorService executorServiceG = Executors.newSingleThreadExecutor();
        Future<Integer> futureG = executorServiceG.submit(new MyCallableG());

        try {
            Integer result = futureG.get();
            logger.info("Result CallableG: {}", result);
        } catch (InterruptedException | ExecutionException e) {
            logger.error("error");
        }
        executorServiceG.shutdown();
    }
}
