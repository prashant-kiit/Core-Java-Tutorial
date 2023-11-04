
// Synchronized Block for independent methods
package com.Prashant.Thread;

import static java.lang.Thread.sleep;

class Asset {
    private int a=0;
    private int b=0;
    // To make t1.changeA and t1.changeB run in different switches
    // also to make t2.changeA and t2.changeB run in different switches
    // and t1.changeA and t2.changeB run simultaneously
    // and t2.changeA and t1.changeB run simultaneously
    // use synchronous block like below
    // here ChangeA and ChangeB are mutually independent
    private void changeA() {
        synchronized (this) {
            a += 100;
        }
    }
    private void changeB() {
        synchronized (this) {
            b -= 100;
        }
    }
    void process(){
        // IF synchronized keyword is used
        // at process(), this will prevent race condition
        // thus prevent undervaluation of Asset
        // Thus t1.changeA and t1.changeB runs in one switch
        // and t2.changeA and t2.changeB runs in another or Vice-versa
        // here ChangeA and ChangeB are mutually dependent
        changeA();
        changeB();
    }
    void show(){
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
}

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        Asset a=new Asset();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<1000) {
                    a.process();
                    i++;
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<1000) {
                    a.process();
                    i++;
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        long start=System.currentTimeMillis();
        t1.start();
        //t1.join(); This does synchronize t1 with t2
        t2.start();
        // These does synchronize t1 and t2 with Main
        t1.join();
        t2.join();
        long end=System.currentTimeMillis();
        a.show();
        System.out.println("Time : " + (end - start));
    }
}
