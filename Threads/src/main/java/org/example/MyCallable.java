package org.example;

import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += 1;
            System.out.println("Callable task - adding" + i);
            Thread.sleep(500);
        }
        return sum;
    }

}
