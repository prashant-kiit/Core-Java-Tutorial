package com.Prashant.Thread;

class Thread2 extends Thread{
    public Thread2(String id02) {
        super(id02);
    }

    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("Thread 2 running");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
