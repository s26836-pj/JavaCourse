package org.example;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

public class MyCallableG implements Callable<Integer> {
    //    Here is update using SLF4J for more robust logging
    static final Logger logger = LoggerFactory.getLogger(MyCallableG.class);
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += 1;
            logger.info("CallableG task adding: {}", i);
            Thread.sleep(500);
        }
        return sum;
    }


}
