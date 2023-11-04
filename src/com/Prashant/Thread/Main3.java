
// Inter thread communication using only sleep/interrupt and polling
package com.Prashant.Thread;

class Resource {
    private int value=-100;
    boolean flag=false;
    void putValue(int value) {
        this.value=value;
        System.out.println("Value Put : " + this.value);
    }
    void getValue() {
        System.out.println("Value Got : " + this.value);
    }

}

class Producer implements Runnable {
    private final Resource r;
    private int value=1;
    Producer(Resource r_temp) {
        r=r_temp;
    }
    @Override
    public void run() {
        while(true) {
            // Using if and else condition with sleep() and interrupt()
            // gives definite inter thread communication
            // This is called polling
            if(!r.flag) {
                r.putValue(value);
                r.flag=true;
                value++;
            }

            // sleep() and interrupt() alone, can be used for inter thread communication
            // but such communication is not definite but only suggestive
            // which results in undesired behaviour of threads
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    private final Resource r;
    public Consumer(Resource r_temp) {
        r=r_temp;
    }
    @Override
    public void run() {
        while(true){
            // Using if and else condition with sleep() and interrupt()
            // gives definite inter thread communication
            // This is called polling
            if(r.flag) {
                r.getValue();
                r.flag=false;
            }

            // sleep() and interrupt() alone, can be used for inter thread communication
            // but such communication is not definite but only suggestive
            // which results in undesired behaviour of threads
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Resource r=new Resource();
        Thread t1=new Thread(new Producer(r));
        Thread t2=new Thread(new Consumer(r));
        t1.start();
        t2.start();
    }
}
