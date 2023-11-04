
// Prevent Race Condition by Two Threads using synchronized keyword
// and join()
package com.Prashant.Thread;

public class Main2 {
    static volatile int c=0; // Resource (Thread Unsafe)
    // Use Synchronized keyword to prevent race condition by multiple threads
    // This make threads t and t2 access the resource one by one (synchronous fashion)
    // OR Volatile keyword can be used since it is variable
    // volatile keyword makes compiler know that the resources it worked upon by multiple threads
    public static void main(String[] args) {

        Runnable r=()->{
            for(int i=0; i<1000; i++) {
                c++;
                System.out.println("Thread 1 " + c);
                 try { // Context Switching if it is not there that race condition will happen
//                 b/c of race condition
//                 the two thread might produce the result of one thread(undervaluation)
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
            }
        };
        Thread t=new Thread(r);

        Runnable r2=()->{
            for(int i=0; i<1000; i++) {
                c++;
                System.out.println("Thread 2 " + c);
                 try { // Context Switching if it is not there that race condition will happen
//                     b/c of race condition the two thread might produce the result of one thread
//                     or one thread might produce the result of two threads
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
            }
        };
        Thread t2=new Thread(r2);

        t.start();
        t2.start();

        // Synchronize method 1: Sleeps the Main Thread which gives buffer time to Thread t and t1 to complete
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }

        // Synchronize method 2: Synchronizes the Threads t and t1 with the Main Thread
        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main " + c);
    }
}
