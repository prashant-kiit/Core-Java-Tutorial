// Thread pooling is used for efficient use of Threads

package com.Prashant.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

class Task implements Runnable {
    private int id=0;
    Task(int id) {
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("Starting " + this.id);
        try {
            sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed " + this.id);
    }
}

public class ThreadPool {

    public static void main(String[] args) {
        // The two threads in thread pool ex will do all 5 tasks  concurrently
        ExecutorService ex= Executors.newFixedThreadPool(2);
        for(int i=1; i<=5; i++) {
            ex.submit(new Task(i));
        }
        // Closes all the threads once all task are done
        ex.shutdown();

        // This helps in synchronizing threads with main
        try {
            ex.awaitTermination(1,TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All Completed");
    }
}
