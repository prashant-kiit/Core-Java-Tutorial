// Inter thread communication using sleep/interrupt, polling
// , wait/notify and synchronized keyword

package com.Prashant.Thread;

class Resource1 {
    private int value=1;
    boolean flag=false;
    // To let The current thread own the Monitor of Object Class
    // which in turn will monitor the two methods of two run methods
    // it is important to keep the two methods as synchronized
    // and wait() and notify() in same class
    synchronized void putValue(int value) throws InterruptedException {
        // locked to the same Class Resource1 object
        // this is fine b/c we don't want two threads to run put and get simultaneously
        if(!flag) {
            this.value = value;
            System.out.println("Value Put : " + this.value);
            flag=true;
            notify();
        }
        else {
            wait();
        }
    }
    synchronized void getValue() throws InterruptedException {
        // locked to the same Class Resource1 object
        // this is fine b/c we don't want two threads to run put and get simultaneously
        if(flag) {
            System.out.println("Value Got : " + this.value);
            flag=false;
            notify();
        }
        else {
            wait();
        }
    }

}

class Producer1 implements Runnable {
    private final Resource1 r;
    private int value=1;
    Producer1(Resource1 r_temp) {
        r=r_temp;
    }
    @Override
    public void run() {
        while(true) {
            try {
                r.putValue(value);
                value++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Without sleep() there is a chance
            // of Race condition on the resource
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer1 implements Runnable {
    private final Resource1 r;
    public Consumer1(Resource1 r_temp) {
        r=r_temp;
    }
    @Override
    public void run() {
        while(true){
            try {
                r.getValue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Without sleep() there is a chance
            // of Race condition by two thread on the resource
            // This might lead to overvaluation
            // ie. two thread might produce the result of one threads
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Resource1 r=new Resource1();
        Thread t1=new Thread(new Producer1(r),"Thread Producer");
        Thread t2=new Thread(new Consumer1(r),"Thread Consumer");
        t1.start();
        t2.start();
    }
}
