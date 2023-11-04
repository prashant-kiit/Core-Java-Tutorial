package com.Prashant.Thread;

public class Main {
    public static void main(String[] args) {

        // Use of Runnable Interface and Functional Interface

            // Use Thread3 Class
        Thread3 r31=new Thread3(); // both works fine
        Runnable r32=new Thread3(); // both works fine
        Thread t31=new Thread(r31);
        Thread t32=new Thread(r32);
        t31.start();
        t32.start();

            // Do not use Thread3 Class
        Runnable r4=new Runnable() { // Anonymous Class to instantiate Functional Interface's instance
            @Override
            public void run() {
                System.out.println("Anonymous Class for Interface instance-Thread 3 is running");
            }
        };
        Runnable r5=()->{ // Lambda Function to instantiate Functional Interface's instance
            System.out.println("Anonymous Class for Interface instance-Thread 3 is running");
        };
        Thread t4=new Thread(r4);
        Thread t5=new Thread(r5);
        t4.start();
        t5.start();

        // Use of Thread Class
        Thread1 t1=new Thread1("ID01");
        Thread2 t2=new Thread2("ID01");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.isInterrupted());
        t2.start();
        while(t2.isAlive()) {
            System.out.println("Not Terminated State");
        }
        System.out.println("Main is Running");
    }
}
