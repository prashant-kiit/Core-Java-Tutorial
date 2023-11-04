package com.Prashant.Thread;

class Thread1 extends Thread{
    public Thread1(String id01) {
        super(id01);
    }

    public void run() {
        int i=0;
        while(i<100) {
            System.out.println("Thread 1 running");
            i++;
        }
    }
}
